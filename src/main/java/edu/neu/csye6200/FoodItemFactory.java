package edu.neu.csye6200;

public class FoodItemFactory implements ItemFactory {
    @Override
    public Item createItem(String csv) {
        return new FoodItem(csv);
    }
}
