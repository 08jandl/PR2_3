package ShoppingCenter;

import java.util.HashMap;
import java.util.Map;

public class GenericShop<T> {
    private String name;

    private Map<String, T> products = new HashMap<>();

    // TODO method still missing here
    // TODO also still missing: a Product class of some sort and the Main class ShoppingCenter
    // TODO to be continued 21.03.2024

    public void showProducts() {
        System.out.println("Welcome to " + name);
        if (products.isEmpty()) {
            System.out.println("Sorry, we're already sold out for today.");
        } else {
            System.out.println("These are our available products: ");
            for (String key : products.keySet()) {
                System.out.println(key);
            }
        }
    }

}
