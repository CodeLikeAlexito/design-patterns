import patterns.BasicSingleton;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(123);
        System.out.println(singleton.getValue());
    }
}