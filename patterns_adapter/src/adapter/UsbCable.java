package adapter;

import adapter.interfaces.ICard;
import adapter.interfaces.IUsbAdapter;

public class UsbCable implements IUsbAdapter {

    @Override
    public void set()
    {
        System.out.println("USB кабель подключен");
    }
}
