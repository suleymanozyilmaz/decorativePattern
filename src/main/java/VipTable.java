public class VipTable extends ReserveTable {

    public double vipTablePrice = 250;
    @Override
    String getTableinfo() {
        return "You reserved a VIP table. Enjoy your time \n";
    }

    @Override
    double getTotalPrice() {
        return 0+vipTablePrice;
    }
}
