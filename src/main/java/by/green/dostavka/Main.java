package by.green.dostavka;

import by.green.dostavka.catalog.CatalogItem;
import by.green.dostavka.catalog.CatalogSubcategory;
import by.green.dostavka.catalog.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Green Dostavka application started");

        Product freshCarrot = new Product("Морковь свежая вес", 1.49);
        Product cleanCarrot = new Product("Морковь мытая пакет", 2.29);
        Product youngCarrot = new Product("Морковь молодая вес", 3.19);

        ArrayList<Product> carrots = new ArrayList<>();
        carrots.add(freshCarrot);
        carrots.add(cleanCarrot);
        carrots.add(youngCarrot);

        CatalogItem catalogItemCarrot = new CatalogItem("Морковь", carrots);

        Product freshPotato = new Product("Картофель свежий урожай вес", 1.19);
        Product premiumPotato = new Product("Картофель отборный фасованный", 2.49);
        Product potatoForFrying = new Product("Картофель для жарки вес", 1.89);

        ArrayList<Product> potatoes = new ArrayList<>();
        potatoes.add(freshPotato);
        potatoes.add(premiumPotato);
        potatoes.add(potatoForFrying);

        CatalogItem catalogItemPotato = new CatalogItem("Картофель", potatoes);

        ArrayList<CatalogItem> vegetables = new ArrayList<>();
        vegetables.add(catalogItemCarrot);
        vegetables.add(catalogItemPotato);

        CatalogSubcategory catalogSubcategoryVegetables = new CatalogSubcategory("Овощи", vegetables);
    }
}
