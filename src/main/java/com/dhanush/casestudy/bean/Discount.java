package com.dhanush.casestudy.bean;

public class Discount {
    private String code;
    private int discount;
    private int discount_id;

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "code='" + code + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Discount(String code, int discount) {
        this.code = code;
        this.discount = discount;
    }

    public Discount() {

    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
