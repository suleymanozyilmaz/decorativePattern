package com.caffeReserve;

public class Main {

    public static void main(String[] args){
        ReserveTable newTable = new VipTable();
        System.out.println("" + newTable.getTableinfo() );
        System.out.println("" + newTable.getTotalPrice() );

        newTable = new Drink(newTable);
        newTable = new TableGame(newTable);
        System.out.println("" + newTable.getTableinfo());
        System.out.println("" + newTable.getTotalPrice());

    }
}
