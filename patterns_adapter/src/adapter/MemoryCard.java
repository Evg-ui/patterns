package adapter;

import adapter.interfaces.ICard;

public class MemoryCard implements ICard {
    public void set()
    {
        System.out.println("Карта памяти подключена");
    }
}
