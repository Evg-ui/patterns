package adapter;

import adapter.interfaces.ICard;

public class Computer {
    public void read(ICard iCard)
    {
        iCard.set();
        //System.out.println("Данные с карты прочитаны!");
    }
// информационное сообщение
    public void readFinish()
    {
        System.out.println("Данные прочитаны компьютером!");
    }
    }
