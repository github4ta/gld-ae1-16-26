package by.green.dostavka;

import by.green.dostavka.catalog.CatalogItem;
import by.green.dostavka.catalog.CatalogSubcategory;
import by.green.dostavka.catalog.Product;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Green Dostavka application started");

        Product appleFresh = new Product("Яблоки свежие вес", 6.50);
        Product appleGolden = new Product("Яблоко Голден вес", 5.20);
        Product appleJeromine = new Product("Яблоко Джеромини вес", 3.99);

        ArrayList<Product> apples = new ArrayList<>();
        apples.add(appleFresh);
        apples.add(appleGolden);
        apples.add(appleJeromine);

        CatalogItem catalogItemApple = new CatalogItem("Яблоко", apples);

        Product pearOksana = new Product("Груша Оксана вес", 6.99);
        Product pearConference = new Product("Груша Конференция крупная", 5.49);
        Product pearSingo = new Product("Груша Синго вес", 6.49);

        ArrayList<Product> pears = new ArrayList<>();
        pears.add(pearOksana);
        pears.add(pearConference);
        pears.add(pearSingo);

        CatalogItem catalogItemPear = new CatalogItem("Груша", pears);

        ArrayList<CatalogItem> fruits = new ArrayList<>();
        fruits.add(catalogItemApple);
        fruits.add(catalogItemPear);

        CatalogSubcategory catalogSubcategoryFruits = new CatalogSubcategory("Фрукты", fruits);

        System.out.println(catalogSubcategoryFruits);
    }
}
