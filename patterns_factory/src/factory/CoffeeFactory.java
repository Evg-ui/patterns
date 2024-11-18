package factory;

import factory.enums.CoffeeType;
import factory.interfaces.ICoffee;

// фабрика, выносим логику создания нужного кофе
public class CoffeeFactory {
    public ICoffee getCoffee(CoffeeType coffeeType) {
        ICoffee ICoffee;
        // в зависимости от запрошенного типа кофе создаем объект нужного класса, в случае отсутствия типа кофе выдаем исключение
        switch (coffeeType) {
            case AMERICANO: ICoffee = new Americano();
            break;
            case ESPRESSO: ICoffee = new Espresso();
            break;
            default: throw new IllegalArgumentException("Invalid coffee type"); // исключение
        }
        return ICoffee;    // возвращаем "интерфейс" и идем готовить кофе в Machine
    }
}
