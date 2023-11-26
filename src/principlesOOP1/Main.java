package principlesOOP1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<> ();
//        productList.add( new BottleOfWater ( "Aqva", 123, 100 ) );
//        productList.add( new BottleOfWater ( "BonAqva", 321, 250 ) );
//        productList.add( new BottleOfWater ( "Cola", 350, 150 ) );
//        productList.add( new BottleOfWater ( "Fanta", 111, 1000 ) );
//        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine ();
//        vendingMachine.initProduct ( productList );
//        System.out.println (vendingMachine.getProduct ( "Aqva", 100 ));
//        Product test = new BottleOfWater ( "asd", 123, 123 );
//        System.out.println (test.toString ());
        productList.add ( new HotDrink ( "Coffe", 123, 1500, 60 ) );
        productList.add ( new HotDrink ( "Tea", 100, 150, 90 ) );
        productList.add ( new HotDrink ( "Latte", 500, 250, 75 ) );
        productList.add ( new HotDrink ( "Capuchino", 330, 200, 65 ) );
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine ();
        hotDrinksVendingMachine.initProduct ( productList );
        System.out.println (hotDrinksVendingMachine.getProduct ( "Latte", 250, 75 ));


    }
}
