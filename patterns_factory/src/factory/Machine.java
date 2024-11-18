package factory;

import factory.enums.CoffeeType;
import factory.interfaces.ICoffee;

// "механизм" для приготовления: задан тип кофе, запускает начало приготовления, отображает тип выбранного кофе
public class Machine {
    private CoffeeMachine coffeeMachine;

     // механизм для приготовления запрошенного типа кофе
    public Machine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    // при заданном типе кофе запускается приготовление
    public void start(CoffeeType coffeeType) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();  // создаем объект Фабрики
        ICoffee iCoffee = coffeeFactory.getCoffee(coffeeType);  // создаем и получаем нужный тип кофе объекта типа Кофе
        makeCoffee();   // выводим инфо о начале приготовления
        setCoffee(iCoffee.prepareCoffee());   // выводим инфо о приготовлении заданного типа кофе
        System.out.println("Preparing started!");
    }

     // пустой метод, показывает начало приготовления
    private void makeCoffee() {
        System.out.println("Making coffee");
    }

     // пустой метод, выводит тип выбранного к приготовлению кофе
    private void setCoffee(String coffeeType) {
        System.out.println("Need to prepare " + coffeeType);
    }
}
