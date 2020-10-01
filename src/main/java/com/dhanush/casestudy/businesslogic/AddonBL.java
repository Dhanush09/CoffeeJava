package com.dhanush.casestudy.businesslogic;

import com.dhanush.casestudy.bean.CoffeeAddOns;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AddonBL {
    ArrayList<CoffeeAddOns> getAllCoffeeAddons() throws ClassNotFoundException, SQLException;

    public int getAddonPrice(String addon) throws ClassNotFoundException, SQLException;
}
