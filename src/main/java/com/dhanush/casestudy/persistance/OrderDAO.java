package com.dhanush.casestudy.persistance;

import com.dhanush.casestudy.bean.Order;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.sql.SQLException;

public interface OrderDAO {
    void insertOrder(Order order, int coffee_id, int size_id, int addon_id, int discount_id) throws ClassNotFoundException, SQLException;
    // public int getBill(Order order,int coffee_id) throws ClassNotFoundException,SQLException;
}
