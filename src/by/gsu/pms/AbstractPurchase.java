package by.gsu.pms;

public abstract class AbstractPurchase implements Comparable<AbstractPurchase>{
    private Commodity commodity;
    private int number;

    public AbstractPurchase(Commodity commodity, int number) {
        this.commodity = commodity;
        this.number = number;
    }

    public AbstractPurchase() {

    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCost(){
        return commodity.getPrice()*number;
    }

    @Override
    public final String toString() {
        return fieldsToString() + ";" + getCost();
    }

    protected String fieldsToString(){
        return  commodity + ";" + number;
    }



    @Override
    public int compareTo(AbstractPurchase purchase) {
        return purchase.getCost()-this.getCost();
    }
}