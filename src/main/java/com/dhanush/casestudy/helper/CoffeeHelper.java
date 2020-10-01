package com.dhanush.casestudy.helper;

import com.dhanush.casestudy.bean.Coffee;
import com.dhanush.casestudy.bean.CoffeeAddOns;
import com.dhanush.casestudy.bean.CoffeeSize;

public class CoffeeHelper {

    public static void displayCoffee(Coffee coffee) {
        System.out.println(coffee.getCoffee_name() + "   " + coffee.getCoffee_price() + "  " + coffee.getCoffee_id());
    }

    public static void displaySize(CoffeeSize coffeeSize) {
        System.out.println(coffeeSize.getSize() + "   " + coffeeSize.getSize_price() + "  " + coffeeSize.getSize_id());
    }

    public static void dispkayAddon(CoffeeAddOns coffeeAddOns) {
        System.out.println(coffeeAddOns.getAddon() + "   " + coffeeAddOns.getAddon_price() + "  " + coffeeAddOns.getAddon_id());
    }

}
