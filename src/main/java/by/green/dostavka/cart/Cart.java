package by.green.dostavka.cart;

import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Cart(ArrayList<CartItem> items) {
        this.items = items;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartItem> items) {
        this.items = items;
    }
}
