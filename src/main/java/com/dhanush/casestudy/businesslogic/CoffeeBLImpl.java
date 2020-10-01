package com.dhanush.casestudy.businesslogic;

import com.dhanush.casestudy.bean.Coffee;
import com.dhanush.casestudy.bean.CoffeeSize;
import com.dhanush.casestudy.bean.CoffeeAddOns;
import com.dhanush.casestudy.bean.Discount;
import com.dhanush.casestudy.persistance.CoffeeDAO;
import com.dhanush.casestudy.persistance.CoffeeImpl;
import com.dhanush.casestudy.persistance.*;

import java.sql.SQLException;
import java.util.ArrayList;

public class CoffeeBLImpl implements CoffeeBL {

    private CoffeeDAO coffeeDAO = new CoffeeImpl();


    public ArrayList<Coffee> getAllCoffeeNames() throws ClassNotFoundException, SQLException {
        // ArrayList<Coffee> coffeelist;
        //coffeelist =
        //ArrayList<Coffee> newcoffeeList = new ArrayList<>();
        //for (Coffee coffee : coffeelist) {
        //  newcoffeeList.add(coffee);
        //}
        return coffeeDAO.getAllCoffee();

    }


    @Override
    public int getCoffeePrice(String name) throws ClassNotFoundException, SQLException {
        ArrayList<Coffee> coffeeArrayList1 = getAllCoffeeNames();
        for (Coffee coffee : coffeeArrayList1) {
            if (coffee.getCoffee_name().equalsIgnoreCase(name)) {
                return coffee.getCoffee_price();
            }

        }

        return 0;
    }


}