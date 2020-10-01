package com.dhanush.casestudy.presentation;

import com.dhanush.casestudy.bean.Discount;
import com.dhanush.casestudy.businesslogic.DiscountBL;
import com.dhanush.casestudy.businesslogic.DiscountBLImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowDiscount {
    private Discount discount = new Discount();
    private DiscountBL discountBL = new DiscountBLImpl();

    public void showCoupons() throws SQLException, ClassNotFoundException {
        ArrayList<Discount> discountArray;
        discountArray = discountBL.getFinalDiscount();
        for (Discount temp : discountArray) {
            System.out.println(temp.getCode() + ")   Discount " + temp.getDiscount());
        }
    }
}
