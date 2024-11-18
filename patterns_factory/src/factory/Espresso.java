package factory;

import factory.interfaces.ICoffee;

// класс Эспрессо, умеет готовиться, наследник класса ICoffee (interface), возвращает наименование кофе
public class Espresso implements ICoffee {
    @Override
    public String prepareCoffee() {
        return "Espresso!";
    }
}
