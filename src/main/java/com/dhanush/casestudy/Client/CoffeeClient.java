package com.dhanush.casestudy.Client;


import com.dhanush.casestudy.helper.CoffeeHelper;
import com.dhanush.casestudy.presentation.CoffeeMenuInteraction;
import com.dhanush.casestudy.presentation.CoffeeMenuInteractionImpl;
import com.dhanush.casestudy.presentation.TakeOrder;
import com.dhanush.casestudy.bean.*;
import com.dhanush.casestudy.businesslogic.*;
import com.dhanush.casestudy.presentation.*;

import java.sql.SQLException;
import java.util.Scanner;

public class CoffeeClient {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);
        Order order = new Order();
        Coffee coffee = new Coffee();
        CoffeeAddOns coffeeAddOns = new CoffeeAddOns();
        CoffeeSize coffeeSize = new CoffeeSize();
        Discount discount = new Discount();

        ShowCoffee showCoffee = new ShowCoffee();
        System.out.println("WELCOME!!");
        //CoffeeHelper.displayCoffee(coffee);
        showCoffee.showCoffeePrice();
        System.out.println("Enter Coffee ID: ");
        order.setCoffee_id(scan.nextInt());


        ShowAddOns showAddOns = new ShowAddOns();
        showAddOns.showAllAddOns();
        // CoffeeHelper.dispkayAddon(coffeeAddOns);
        System.out.println("Enter AddOn ID: ");
        order.setAddon_id(scan.nextInt());

        ShowSize showSize = new ShowSize();
        showSize.showSize();
        // CoffeeHelper.displaySize(coffeeSize);
        System.out.println("Enter Size ID");
        order.setSize_id(scan.nextInt());

        ShowDiscount showCoupons = new ShowDiscount();
        showCoupons.showCoupons();
        System.out.println("Enter Coupon ID");
        order.setDiscount_id(scan.nextInt());

        TakeOrder takeOrder = new TakeOrder();
        takeOrder.placeOrder(order);
        takeOrder.showBill(order);
    }
}
