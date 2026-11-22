package by.green.dostavka.catalog;

import java.util.ArrayList;

public class CatalogSubcategory {
    private String name;
    private ArrayList<CatalogItem> items;

    public CatalogSubcategory() {
        this.items = new ArrayList<>();
    }

    public CatalogSubcategory(String name, ArrayList<CatalogItem> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CatalogItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CatalogItem> items) {
        this.items = items;
    }
}
