package edu.neu.csye6200;

import java.util.*;

public class Store extends AbstractStore {
    private List<Item> items = new ArrayList<>();

    @Override
    public void demo() {
        String basePath = "data/";
        
        List<String> foodData = FileUtil.readCSV(basePath + "FoodItemCSV.txt");
        List<String> electronicData = FileUtil.readCSV(basePath + "ElectronicItemCSV.txt");
        List<String> serviceData = FileUtil.readCSV(basePath + "ServiceItemCSV.txt");

        FoodItemFactory foodFactory = new FoodItemFactory();
        ElectronicItemFactory electronicFactory = ElectronicItemFactory.getInstance();
        ServiceItemFactory serviceFactory = ServiceItemFactory.getInstance();

        for (String line : foodData) items.add(foodFactory.createItem(line));
        for (String line : electronicData) items.add(electronicFactory.createItem(line));
        for (String line : serviceData) items.add(serviceFactory.createItem(line));

        System.out.println("\nSorting by ID:");
        items.stream().sorted(Comparator.comparing(Item::getId)).forEach(System.out::println);

        System.out.println("\nSorting by Name:");
        items.stream().sorted(Comparator.comparing(Item::getName)).forEach(System.out::println);

        System.out.println("\nSorting by Price:");
        items.stream().sorted(Comparator.comparing(Item::getPrice)).forEach(System.out::println);
    }
}
