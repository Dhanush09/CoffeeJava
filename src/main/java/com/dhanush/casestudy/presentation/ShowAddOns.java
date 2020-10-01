package com.dhanush.casestudy.presentation;

import com.dhanush.casestudy.bean.CoffeeAddOns;
import com.dhanush.casestudy.businesslogic.AddonBL;
import com.dhanush.casestudy.businesslogic.AddonBLImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowAddOns {
    private AddonBL addOnBL = new AddonBLImpl();
    private ArrayList<CoffeeAddOns> addOns;

    public void showAllAddOns() throws SQLException, ClassNotFoundException {
        addOns = addOnBL.getAllCoffeeAddons();
        System.out.println("Available addOns are: ");
        for (CoffeeAddOns temp : addOns) {
            System.out.println(temp.getAddon_id() + ") " + temp.getAddon());
        }
    }
}
