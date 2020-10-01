package com.dhanush.casestudy.businesslogic;

import com.dhanush.casestudy.bean.Discount;
import com.dhanush.casestudy.persistance.DiscountDAO;
import com.dhanush.casestudy.persistance.DiscountDAOIml;

import java.sql.SQLException;
import java.util.ArrayList;

public class DiscountBLImpl implements DiscountBL {
    private DiscountDAO discountDAO = new DiscountDAOIml();

    @Override
    public ArrayList<Discount> getFinalDiscount() throws ClassNotFoundException, SQLException {
        //  ArrayList<Discount> discounts;
        //discounts =
        //ArrayList<Discount> discountArrayList = new ArrayList<>();
        //for (Discount discount : discounts) {
        //  discountArrayList.add(discount);
        //}
        return discountDAO.getAllDiscount();
    }

    @Override
    public int getDiscountValue(String dis) throws ClassNotFoundException, SQLException {
        ArrayList<Discount> discountArrayList1 = getFinalDiscount();
        for (Discount coffeediscount : discountArrayList1) {
            if (coffeediscount.getCode().equalsIgnoreCase(dis)) {
                System.out.println("COUPON APPLIED");
                return coffeediscount.getDiscount();
            }
        }
        return 0;
    }

}
