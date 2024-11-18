package factory.interfaces;

// интерфейс кофемашины, которая готовит выбранный тип кофе
// класс ICoffee  с наследниками типов кофе: американо и эспрессо
// выдает тип кофе
public interface ICoffee {
    public String prepareCoffee();
}
