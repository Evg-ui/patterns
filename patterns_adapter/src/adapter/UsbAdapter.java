package adapter;

import adapter.interfaces.ICard;

public class UsbAdapter implements ICard {

    private final UsbCable usbCable;

    public UsbAdapter(UsbCable usbCable) {

        this.usbCable = usbCable;
    }

    @Override
    public void set() {
    usbCable.set();
            };
}
