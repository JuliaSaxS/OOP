package Domen;

public class HotDrink extends Bottle {
    private int temper;

    /**
     * Создать наследника bottle
     * дополнительным полем температура.
     * 
     * @param productId
     * @param productName
     * @param productCategory
     * @param price
     * @param volume
     * @throws Exception
     */

    public HotDrink(int productId, String productName, String productCategory, double price, int volume,int temper)
            throws Exception {
        super(productId, productName, productCategory, price, volume);
        this.temper = temper;
    }

    public int getTemper() {
        return temper;
    }

    public void setTemper(int temper) {
        this.temper = temper;
    }
    
    @Override
    public String toString()
    {
        return "Product{" +
        "name = '" + super.getProductName() + '\'' +
        "category= '" + super.getProductCategory() + '\'' +
        ", cost= " + super.getPrice() +
        ", volume= " + super.getVolume() +'\''+
        ", temperature= " + temper +
        '}';
    }

}
