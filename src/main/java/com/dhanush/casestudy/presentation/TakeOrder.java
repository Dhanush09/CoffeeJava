package com.dhanush.casestudy.presentation;

import com.dhanush.casestudy.bean.Order;
import com.dhanush.casestudy.businesslogic.OrderBL;
import com.dhanush.casestudy.businesslogic.OrderBLImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class TakeOrder {

    private OrderBL orderBL = new OrderBLImpl();

    public void placeOrder(Order order) throws SQLException, ClassNotFoundException {
        ArrayList<String> arrayList;
        arrayList = orderBL.getDetails(order);
        System.out.println("Coffee: " + arrayList.get(0));
        System.out.println("AddOn: " + arrayList.get(1));
        System.out.println("Size: " + arrayList.get(2));
        System.out.println("Coupon: " + arrayList.get(3));
    }

    public void showBill(Order order) throws SQLException, ClassNotFoundException {
        double bill = orderBL.calculateBill(order);
        System.out.println("Bill: " + bill);
    }
}
