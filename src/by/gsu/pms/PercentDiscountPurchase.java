package by.gsu.pms;

public class PercentDiscountPurchase extends AbstractPurchase{
    private int percentDiscount;


    public PercentDiscountPurchase(Commodity commodity, int number, int percentDiscount) {
        super(commodity, number);
        this.percentDiscount = percentDiscount;
    }

    public PercentDiscountPurchase(int percentDiscount) {
        this.percentDiscount = percentDiscount;
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
