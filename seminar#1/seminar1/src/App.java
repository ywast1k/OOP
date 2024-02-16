import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domen.Bottle;
import domen.HotDrink;
import domen.Product;
import services.Display;
import services.Holder;
import services.VendigMachine;
import services.coinDispenser;

public class App {
 
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(
            1, "Chips Lays", 132.55, 13
            );
        Product product2 = new Product(
            2, "chocolate", 55.23, 10
            );
        Product product3 = new Product(
            3, "nuts", 222.55, 15
            );
        Bottle bottle1 = new Bottle(
            4, "cola", 50, 11, 0.5
            );

        HotDrink HotDrink1 = new HotDrink(
            5, "cacao", 35, 16, 95 
            );
        HotDrink HotDrink2 = new HotDrink(
            6, "starbax", 45, 17, 95 
            );
        
            List<Product> ourList = new ArrayList();
            ourList.add(product1);
            ourList.add(product2);
            ourList.add(product3);
            ourList.add(bottle1);
            ourList.add(HotDrink1);
            ourList.add(HotDrink2);
            
        
            
        Holder holder = new Holder();
        Display display = new Display();
        coinDispenser coinDispenser = new coinDispenser();
        
                

        VendigMachine machine = new VendigMachine(holder, display, coinDispenser, ourList);
        
            for (Product item: machine.getProduct()){
                System.out.println(item);
            }
                
        
          

        //System.out.println(ourList);
        }
}
