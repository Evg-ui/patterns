import factory.CoffeeMachine;
import factory.Machine;
import factory.enums.CoffeeType;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(); // создаем объект для начала приготовления
        Machine machine = new Machine(coffeeMachine);   // создаем объект для запуска механизма
        machine.start(CoffeeType.AMERICANO); // готовим
        System.out.println("Your coffee is ready.");
    }
}