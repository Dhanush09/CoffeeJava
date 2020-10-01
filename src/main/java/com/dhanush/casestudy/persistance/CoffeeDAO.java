package com.dhanush.casestudy.persistance;

import com.dhanush.casestudy.bean.Coffee;
import com.dhanush.casestudy.bean.CoffeeSize;
import com.dhanush.casestudy.bean.CoffeeAddOns;
import com.dhanush.casestudy.bean.Discount;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoffeeDAO {
    ArrayList<Coffee> getAllCoffee() throws ClassNotFoundException, SQLException;

    Coffee getCoffeePrice(String name) throws ClassNotFoundException, SQLException;

    Coffee getCoffeePrice(int id) throws ClassNotFoundException, SQLException;


}
