package factory;

import factory.interfaces.ICoffee;

// класс Американо, умеет готовиться, наследник класса ICoffee (interface), возвращает наименование кофе
public class Americano implements ICoffee {
    @Override
    public String prepareCoffee() {

        return "Americano!";
    }
}