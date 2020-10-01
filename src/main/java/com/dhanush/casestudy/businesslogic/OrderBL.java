package com.dhanush.casestudy.businesslogic;

import com.dhanush.casestudy.bean.Order;

import java.sql.SQLException;
import java.util.ArrayList;

public interface OrderBL {
    //public void placeOrder(Order order) throws ClassNotFoundException, SQLException;
    public int calculateBill(Order order) throws ClassNotFoundException, SQLException;

    public ArrayList getDetails(Order order) throws ClassNotFoundException, SQLException;

    public int getBill(Order order) throws ClassNotFoundException, SQLException;
}
