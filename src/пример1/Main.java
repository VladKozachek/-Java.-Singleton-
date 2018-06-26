package пример1;

public class Main {
    public static void main(String[] args) {

        Singleton singleton=Singleton.getSingleton();
        Singleton singleton2=Singleton.getSingleton();

        System.out.println(singleton);
        System.out.println(singleton2);

    }
}
