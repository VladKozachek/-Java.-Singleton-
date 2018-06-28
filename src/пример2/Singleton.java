package пример2;
// этот синглтон  работает в многопоточности, но не работает ленивая инициализация (синглтон конструирутся при создании)
 public class Singleton {
    public static int COUNT=0;
    private static Singleton instance=new Singleton();
    private Singleton(){
        COUNT++;
    }

    public static Singleton getSingleton(){
           return instance;
    }
}
