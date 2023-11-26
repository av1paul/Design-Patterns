package org.avi.decoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza cheeseFarmhouse = new ExtraCheese(new FarmhousePizza());
        BasePizza cheeseMushroomMargherita = new ExtraCheese(new Mushroom(new MargheritaPizza()));

        System.out.println("Cheese Farmhouse price: " + cheeseFarmhouse.getCost());
        System.out.println("Cheese Mushroom Margherita price: " + cheeseMushroomMargherita.getCost());
    }
}
