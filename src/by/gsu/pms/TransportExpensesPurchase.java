package by.gsu.pms;

public class TransportExpensesPurchase extends AbstractPurchase{
    private int transportExpenses;


    public TransportExpensesPurchase(Commodity commodity, int number, int transportExpenses) {
        super(commodity, number);
        this.transportExpenses = transportExpenses;
    }

    public TransportExpensesPurchase(int transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    public int getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(int transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    @Override
    public int getCost() {
        return super.getCost()+transportExpenses;
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + ";" + transportExpenses;
    }
}
