package com.caffeReserve;

public class Drink extends TableDecorator {
    public Drink(ReserveTable table) {
        super(table);
    }

    double price=0;

    public double addLemonade(){
        price = price+20;
        return price;
    }

    public String addLimonadeStr(){
        return " Limonata eklendi\n";
    }

    @Override
    String getTableinfo() {
        return this.table.getTableinfo() + addLimonadeStr();
    }

    @Override
    double getTotalPrice() {
        return this.table.getTotalPrice() + addLemonade();
    }
}
