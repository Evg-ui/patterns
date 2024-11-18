import proxy.DBases;
import proxy.ProxyDatabase;
import proxy.interfaces.IDatabase;

public class Main {
    public static void main(String[] args) {
     //   IDatabase iDatabase = new IDatabase("localhost", 8080, "myDB");
        // Создаем прокси для подключения к базе данных
        DBases dBases = new DBases("MyDB");
        ProxyDatabase proxyDatabase = new ProxyDatabase("localhost", 8080, "myDB");

        // Подключаемся к базе данных
        dBases.info();
        System.out.println("Подключение к БД:  " + dBases);
        proxyDatabase.connect(); // Подключение с полным URL
          }

}