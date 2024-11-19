package proxy;

import proxy.interfaces.IDatabase;

public class ProxyDatabase implements IDatabase {
    private DBases dBases;
    private String dbName;
    private String host;
    private int port;

    public ProxyDatabase(String host, int port, String dbName) {
        this.host = host;
        this.port = port;
        this.dbName = dbName;
    }

    @Override
    public void connect(){
        // Проверяем, загружено ли реальное подключение
        if (dBases == null) {
            String fullUrl = host + ":" + port + "/" + dbName;
            dBases = new DBases(fullUrl); // Создаем подключение с полным URL
        }
        dBases.connect(); // Подключаемся к БД
    }
    }

