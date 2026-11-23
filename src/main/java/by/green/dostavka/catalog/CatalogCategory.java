package by.green.dostavka.catalog;

import java.util.ArrayList;

public class CatalogCategory {
    private String name;
    private ArrayList<CatalogSubcategory> subcategories;

    public CatalogCategory(){
        this.subcategories = new ArrayList<>();
    }

    public CatalogCategory(String name, ArrayList<CatalogSubcategory> subcategories) {
        this.name = name;
        this.subcategories = subcategories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CatalogSubcategory> getSubcategories() {
        return subcategories;
    }

    public void setSubcategories(ArrayList<CatalogSubcategory> subcategories) {
        this.subcategories = subcategories;
    }
}
