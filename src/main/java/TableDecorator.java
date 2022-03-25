public abstract class TableDecorator extends ReserveTable {

    ReserveTable table;

    public TableDecorator(ReserveTable table){
        this.table = table;
    }


    @Override
    String getTableinfo() {
        return null;
    }

    @Override
    double getTotalPrice() {
        return 0;
    }
}
