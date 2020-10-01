package com.dhanush.casestudy.presentation;

import com.dhanush.casestudy.bean.Coffee;
import com.dhanush.casestudy.businesslogic.CoffeeBL;
import com.dhanush.casestudy.businesslogic.CoffeeBLImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowCoffee {

    private CoffeeBL coffeeBL = new CoffeeBLImpl();


    public void showCoffeeNames() throws SQLException, ClassNotFoundException {
        ArrayList<Coffee> coffee = new ArrayList<>();
        coffee = coffeeBL.getAllCoffeeNames();
        System.out.println("Available coffee are: ");
        for (Coffee temp : coffee) {
            System.out.println(temp.getCoffee_name());
        }
    }

    public void showCoffeePrice() throws SQLException, ClassNotFoundException {
        ArrayList<Coffee> coffee = new ArrayList<>();
        coffee = coffeeBL.getAllCoffeeNames();
        for (Coffee temp : coffee) {
            //System.out.println("Price of " + temp.getCoffeeName() + " is :" + temp.getPrice());
            System.out.println(temp.getCoffee_id() + ") " + temp.getCoffee_name() + ", Price: " + temp.getCoffee_price());
        }
    }
}
