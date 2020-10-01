package com.dhanush.casestudy.presentation;

import com.dhanush.casestudy.bean.CoffeeSize;
import com.dhanush.casestudy.businesslogic.SizeBL;
import com.dhanush.casestudy.businesslogic.SizeBLImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ShowSize {
    private SizeBL sizeBL = new SizeBLImpl();
    private ArrayList<CoffeeSize> sizeArr;
    private CoffeeSize size;

    public void showSize() throws SQLException, ClassNotFoundException {
        sizeArr = sizeBL.getAllCoffeeSize();
        System.out.println("Available size of coffee are: ");
        for (CoffeeSize temp : sizeArr) {
            System.out.println(temp.getSize_id() + " " + temp.getSize());
        }
    }
}
