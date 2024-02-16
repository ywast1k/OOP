package services;

import java.util.List;
import domen.Product;

public class VendigMachine {
    private Holder holder;
    private Display display;
    private coinDispenser coinDispenser;
    private List<Product> product;
    public VendigMachine(Holder holder, Display display, services.coinDispenser coinDispenser, List<Product> product) {
        this.holder = holder;
        this.display = display;
        this.coinDispenser = coinDispenser;
        this.product = product;
    }
    public Holder getHolder() {
        return holder;
    }
    public void setHolder(Holder holder) {
        this.holder = holder;
    }
    public Display getDisplay() {
        return display;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }
    public coinDispenser getCoinDispenser() {
        return coinDispenser;
    }
    public void setCoinDispenser(coinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }
    public List<Product> getProduct() {
        return product;
    }
    public void setProduct(List<Product> product) {
        this.product = product;
    }

    /**
     * @apiNote добавление продукта в аппарат
     * @param product обьект добавляемого продукта
     */
    public void addProduct(Product product){
        if (product.getPrice()<= 0){
            product.setPrice(100);
        }
        this.product.add(product);
    }
        
}
