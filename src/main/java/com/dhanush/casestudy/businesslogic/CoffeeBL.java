package com.dhanush.casestudy.businesslogic;

import com.dhanush.casestudy.bean.Coffee;
import com.dhanush.casestudy.bean.CoffeeSize;
import com.dhanush.casestudy.bean.CoffeeAddOns;
import com.dhanush.casestudy.bean.Discount;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CoffeeBL {
    ArrayList<Coffee> getAllCoffeeNames() throws ClassNotFoundException, SQLException;


    public int getCoffeePrice(String name) throws ClassNotFoundException, SQLException;
    //  public int getCoffeeId(String name) throws ClassNotFoundException,SQLException;


}