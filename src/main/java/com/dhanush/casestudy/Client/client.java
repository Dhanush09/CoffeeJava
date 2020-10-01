package com.dhanush.casestudy.Client;

import com.dhanush.casestudy.presentation.CoffeeMenuInteraction;
import com.dhanush.casestudy.presentation.CoffeeMenuInteractionImpl;
import com.dhanush.casestudy.presentation.TakeOrder;
import com.dhanush.casestudy.bean.*;
import com.dhanush.casestudy.businesslogic.*;

import java.sql.SQLException;


public class client {
    public static void main(String[] args) {
        CoffeeMenuInteraction coffeeMenuInteraction = new CoffeeMenuInteractionImpl();
        Order order = new Order();


        while (true) {
            coffeeMenuInteraction.showMenu();

            int choice = coffeeMenuInteraction.enterChoice();

            coffeeMenuInteraction.performOnMenu(choice);
            TakeOrder takeOrder = new TakeOrder();
            try {
                takeOrder.placeOrder(order);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                takeOrder.showBill(order);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        }
    }
}
