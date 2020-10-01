package com.dhanush.casestudy.businesslogic;

import com.dhanush.casestudy.bean.CoffeeAddOns;
import com.dhanush.casestudy.bean.Discount;
import com.dhanush.casestudy.persistance.AddonDAO;
import com.dhanush.casestudy.persistance.AddonDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class AddonBLImpl implements AddonBL {
    private AddonDAO addonDAO = new AddonDAOImpl();

    @Override
    public ArrayList<CoffeeAddOns> getAllCoffeeAddons() throws ClassNotFoundException, SQLException {
        // ArrayList<CoffeeAddOns> coffeeAddOns;
        //   coffeeAddOns =
        //    ArrayList<CoffeeAddOns> coffeeAddOnsArrayList = new ArrayList<>();
        // for (CoffeeAddOns coffeeAddOns1 : coffeeAddOns) {
        //   coffeeAddOnsArrayList.add(coffeeAddOns1);
        //}
        return addonDAO.getAllAddons();

    }

    @Override
    public int getAddonPrice(String addon) throws ClassNotFoundException, SQLException {
        ArrayList<CoffeeAddOns> coffeeAddOnsArrayList = getAllCoffeeAddons();

        for (CoffeeAddOns coffeeAddOns : coffeeAddOnsArrayList) {
            if (coffeeAddOns.getAddon().equalsIgnoreCase(addon)) {
                return coffeeAddOns.getAddon_price();
            }
        }
        return 0;
    }

}
