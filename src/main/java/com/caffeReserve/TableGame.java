package com.caffeReserve;

public class TableGame extends TableDecorator{
    public TableGame(ReserveTable table) {
        super(table);
    }
    double price =0;

    public double addMonopoly(){
        price = price+50;
        return price;
    }

    public String addMonolopolyStr(){
        return "Monopoly eklendi\n";
    }

    @Override
    String getTableinfo() {
        return this.table.getTableinfo() + addMonolopolyStr();
    }

    @Override
    double getTotalPrice() {
        return this.table.getTotalPrice() + addMonopoly();
    }
}
