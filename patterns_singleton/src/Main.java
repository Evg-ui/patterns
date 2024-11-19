import singleton.Logger;
import singleton.Test2Class;
import singleton.TestClass;

public class Main {
    public static void main(String[] args) {
        // 1 экземпляр логгера
        Logger logger =  Logger.getInstance();

        // логгируем информацию о классе TestClass
        TestClass testClass = new TestClass();
        logger.classLogg(testClass, "Some info about testClass");

        // логгируем информацию о классе Test2Class
        Test2Class test2Class = new Test2Class();
        logger.classLogg(test2Class, "Some info about test2Class");
    }
}
