package пример3;
// этот синглтон  работает в многопоточности,работает ленивая инициализация ,но synchronized ест много памяти
 public class Singleton {
    public static int COUNT=0;
    private static Singleton instance=null;
    private Singleton(){
        COUNT++;
    }

    public static synchronized Singleton getSingleton(){
          if (instance == null){
              instance=new Singleton();
          }
          return instance;
    }
}
