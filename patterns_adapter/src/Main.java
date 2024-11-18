import adapter.Computer;
import adapter.MemoryCard;
import adapter.UsbAdapter;
import adapter.UsbCable;
import adapter.interfaces.ICard;

public class Main {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();

         //Подключаемся к карте для считывания
        Computer computer = new Computer();
        computer.read(memoryCard);

        // в адаптер помещаем кабель
        UsbCable usbCable = new UsbCable();
        UsbAdapter usbAdapter = new UsbAdapter(usbCable);

        // компьютер читает
        Computer computer2 = new Computer();
        computer.read(usbAdapter);
        computer2.readFinish();
    }
}