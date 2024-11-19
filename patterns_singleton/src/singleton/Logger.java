package singleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Logger {
    private static Logger logger = new Logger();

    // приватный конструктор
    private Logger() {}

    // метод для получения объекта, synchronized -разные потоки умеют создавать свои объекты
    public static synchronized Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    // Метод для логирования информации
    public void classLogg(Object obj, String info) {
        // получаем имя класса
        String className = obj.getClass().getSimpleName();

        // Текущая дата
        LocalDate currentDate = LocalDate.now();
        // Определяем формат даты
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        // Форматируем дату
        String formattedDate = currentDate.format(formatter);

        // Выводим лог
        System.out.println("Log info: " + formattedDate + " - " + className + " - " + info);
    }

}
