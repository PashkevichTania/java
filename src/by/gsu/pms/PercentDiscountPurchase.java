package by.gsu.pms;

public class PercentDiscountPurchase extends AbstractPurchase{
    private int percentDiscount;


    public PercentDiscountPurchase(Commodity commodity, int number, int priceDiscount) {
        super(commodity, number);
        this.percentDiscount = priceDiscount;
    }

    public PercentDiscountPurchase(int priceDiscount) {
        this.percentDiscount = priceDiscount;
    }

    public int getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(int percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    @Override
    public int getCost() {
        return super.getCost()*(percentDiscount/100);
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + percentDiscount;
    }
}
