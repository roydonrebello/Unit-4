/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeeshop;

/**
 *
 * @author roydo
 */
public class CoffeeShop {

    // Coffee Interface
    public interface Coffee {
        double cost();           // Method to get the total cost of the coffee
        String description();    // Method to get the description of the coffee
    }

    // Simple Coffee Class (Base Coffee)
    public static class SimpleCoffee implements Coffee {

        @Override
        public double cost() {
            return 2.00;  // Base price of a simple coffee
        }

        @Override
        public String description() {
            return "Simple Coffee";  // Basic coffee description
        }
    }

    // Abstract CoffeeDecorator Class (Decorator Base Class)
    public static abstract class CoffeeDecorator implements Coffee {
        protected Coffee coffee;

        public CoffeeDecorator(Coffee coffee) {
            this.coffee = coffee;
        }

        @Override
        public double cost() {
            return coffee.cost();
        }

        @Override
        public String description() {
            return coffee.description();
        }
    }

    // Milk Decorator Class
    public static class MilkDecorator extends CoffeeDecorator {

        public MilkDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double cost() {
            return super.cost() + 0.50;  // Adding $0.50 for milk
        }

        @Override
        public String description() {
            return super.description() + ", Milk";  // Add "Milk" to the description
        }
    }

    // Sugar Decorator Class
    public static class SugarDecorator extends CoffeeDecorator {

        public SugarDecorator(Coffee coffee) {
            super(coffee);
        }

        @Override
        public double cost() {
            return super.cost() + 0.30;  // Adding $0.30 for sugar
        }

        @Override
        public String description() {
            return super.description() + ", Sugar";  // Add "Sugar" to the description
        }
    }

    // Flavor Shot Decorator Class
    public static class FlavorShotDecorator extends CoffeeDecorator {
        private String flavor;

        public FlavorShotDecorator(Coffee coffee, String flavor) {
            super(coffee);
            this.flavor = flavor;
        }

        @Override
        public double cost() {
            return super.cost() + 0.75;  // Adding $0.75 for a flavor shot
        }

        @Override
        public String description() {
            return super.description() + ", " + flavor + " Flavor Shot";  // Add flavor shot to the description
        }
    }

    public static void main(String[] args) {
        // Start with a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.description() + " | Price: $" + coffee.cost());

        // Add milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.description() + " | Price: $" + coffee.cost());

        // Add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.description() + " | Price: $" + coffee.cost());

        // Add vanilla flavor shot
        coffee = new FlavorShotDecorator(coffee, "Vanilla");
        System.out.println(coffee.description() + " | Price: $" + coffee.cost());
    }
}
