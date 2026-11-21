package by.green.dostavka.catalog;

import java.util.ArrayList;

public class CatalogItem {
    private String name;
    private ArrayList<Product> products;

    public CatalogItem() {
        this.products = new ArrayList<>();
    }

    public CatalogItem(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
