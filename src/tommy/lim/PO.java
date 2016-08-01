package tommy.lim;

/**
 * Created by IE on 6/7/2016.
 */
public class PO {
    private int ponumbers;
    private float quantity;
    private String UOM;
    private Item products;

    public PO(int ponumbers, float quantity, String UOM, Item products) {
        this.ponumbers = ponumbers;
        this.quantity = quantity;
        this.UOM = UOM;
        this.products = products;
    }

    public int getPonumbers() {
        return ponumbers;
    }

    public void setPonumbers(int ponumbers) {
        this.ponumbers = ponumbers;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUOM() {
        return UOM;
    }

    public void setUOM(String UOM) {
        this.UOM = UOM;
    }

    public Item getProducts() {
        return products;
    }

    public void setProducts(Item products) {
        this.products = products;
    }
    public float getTotalPOAmount(){
        return products.getPrice()*quantity;
    }
}
