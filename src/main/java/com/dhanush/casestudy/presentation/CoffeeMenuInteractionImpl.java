package com.dhanush.casestudy.presentation;

import com.dhanush.casestudy.bean.*;
import com.dhanush.casestudy.businesslogic.CoffeeBL;
import com.dhanush.casestudy.businesslogic.CoffeeBLImpl;
import com.dhanush.casestudy.helper.CoffeeHelper;
import com.dhanush.casestudy.businesslogic.*;
import com.dhanush.casestudy.persistance.CoffeeDAO;
import com.dhanush.casestudy.persistance.CoffeeImpl;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeMenuInteractionImpl implements CoffeeMenuInteraction {
    private int price1;
    private int price2;
    private int price3;
    private int bill;
    private int price4;


    private CoffeeBL coffeeBL = new CoffeeBLImpl();
    private SizeBL sizeBL = new SizeBLImpl();
    private AddonBL addonBL = new AddonBLImpl();
    private DiscountBL discountBL = new DiscountBLImpl();
    private OrderBL orderBL = new OrderBLImpl();

    @Override
    public void showMenu() {
        System.out.println("1:Menu");
        System.out.println("2:Enter Coffee name");
        System.out.println("3:Exit");
    }

    @Override
    public void performOnMenu(int choice) {
        Scanner sc = new Scanner(System.in);
        try {
            switch (choice) {
                case 1:
                    ArrayList<Coffee> coffeeArrayList = coffeeBL.getAllCoffeeNames();
                    for (Coffee coffee : coffeeArrayList) {
                        CoffeeHelper.displayCoffee(coffee);
                    }
                    break;
                case 2:
                    System.out.println("Select Coffee  :");
                    //int id = sc.nextInt();
                    ArrayList<Coffee> coffeeArrayList1 = coffeeBL.getAllCoffeeNames();
                    for (Coffee coffee : coffeeArrayList1) {
                        CoffeeHelper.displayCoffee(coffee);
                    }
                    String name = sc.next();
                    System.out.println("Select Size :");
                    ArrayList<CoffeeSize> sizeArrayList = sizeBL.getAllCoffeeSize();
                    for (CoffeeSize coffeeSize : sizeArrayList) {
                        CoffeeHelper.displaySize(coffeeSize);
                    }
                    String size = sc.next();
                    System.out.println("Select Addon :");
                    ArrayList<CoffeeAddOns> coffeeAddOnsArrayList = addonBL.getAllCoffeeAddons();
                    for (CoffeeAddOns coffeeAddOns : coffeeAddOnsArrayList) {
                        CoffeeHelper.dispkayAddon(coffeeAddOns);
                    }
                    String addon = sc.next();
                    price1 = coffeeBL.getCoffeePrice(name);
                    price2 = sizeBL.getSizePrice(size);
                    System.out.println("Enter Coupon Code");
                    String dis = sc.next();
                    ArrayList<Discount> discountArrayList = discountBL.getFinalDiscount();


                    price3 = addonBL.getAddonPrice(addon);
                    price4 = discountBL.getDiscountValue(dis);
                    bill = price1 + price2 + price3 - price4;
                    //Order order= new Order();
                    //orderBL.getBill();
                    System.out.println("coffee price is " + price1 + " Size price is " + price2 + " Addon Price is " + price3 + " Discount value is " + price4 + " Total bill " + bill);

                case 3:
                    System.out.println("Good Bye , Thanks for visiting us ! Hope to see you again");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();

        } catch (SQLException ex) {
            ex.printStackTrace();

        }

    }

    /*@Override
    public void showBill() {
        OrderBL orderBL= new OrderBLImpl();
        orderBL.calculateBill();
    }*/


    @Override
    public int enterChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice : ");
        return sc.nextInt();
    }
}
