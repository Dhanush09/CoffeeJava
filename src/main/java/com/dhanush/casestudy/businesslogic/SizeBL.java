package com.dhanush.casestudy.businesslogic;

import com.dhanush.casestudy.bean.CoffeeSize;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SizeBL {
    ArrayList<CoffeeSize> getAllCoffeeSize() throws ClassNotFoundException, SQLException;

    public int getSizePrice(String size) throws ClassNotFoundException, SQLException;
}
