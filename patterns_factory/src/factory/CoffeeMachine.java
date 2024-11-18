package factory;

import factory.interfaces.ICoffee;

// кофемашина, который занимается приготовлением
// на входе объект Icoffee, умеет готовить, выводит информационное сообщение о начале приготовления
public class CoffeeMachine {
    public  void prepare(ICoffee coffee){
        System.out.println("Preparing coffee started...");
    }

}
