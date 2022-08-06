package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new BlackCoffee();
        coffee.make();
        Coffee milk = new CoffeeMilkDecorator(coffee);
        System.out.println(milk.make());
        Coffee sugar = new CoffeeSugarDecorator(coffee);
        System.out.println(sugar.make());
        Coffee milkAndSugar = new CoffeeSugarDecorator(milk);
        System.out.println(milkAndSugar.make());

    }
}
