package com.caffeReserve;

public class Food extends TableDecorator{
    public Food(ReserveTable table) {
        super(table);
    }
    double price = 0;
    public double addHamburger(){
        price = price+75;
        return price;
    }
    public double addPizza(){
        price = price+90;
        return price;
    }

    public String addPizzaStr(){
        return "Pizza eklendi\n";
    }


    @Override
    String getTableinfo() {
        return this.table.getTableinfo() + "ve " + addPizzaStr();
    }

    @Override
    double getTotalPrice() {
        return 0 + addPizza();
    }
}
