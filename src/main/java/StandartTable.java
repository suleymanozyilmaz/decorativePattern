public class StandartTable extends ReserveTable {
    public double standartTablePrice = 100;
    @Override
    String getTableinfo() {
        return "You have a standart table. Enjoy\n";
    }

    @Override
    double getTotalPrice() {
        return 0+standartTablePrice;
    }
}
