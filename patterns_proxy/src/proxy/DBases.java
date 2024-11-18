package proxy;

import proxy.interfaces.IDatabase;

public class DBases implements IDatabase {
    private String dbName;

    // конструктор: экземпляру имя
    public DBases(String dbName) {
        this.dbName = dbName;
       // connect();
    }
    // информационное сообщение
    public void info(){
        System.out.println("Try to connect to database " + dbName + "...");
    }

    @Override
    public void connect() {
        System.out.println("Connected to database: " + dbName);
    }
}
