package пример4;
// этот синглтон  работает в многопоточности,работает ленивая инициализация
 public class Singleton {
    public static int COUNT=0;
    private static volatile Singleton instance=null;
    private Singleton(){
        COUNT++;
    }

    public static  Singleton getSingleton(){
          if (instance == null){
              synchronized(Singleton.class){
                  if (instance == null) {
                      instance = new Singleton();
                  }
              }

          }
          return instance;
    }
}
