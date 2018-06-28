package пример1;
// этот синглтон не работает в многопоточности
public class Singleton {
    public static int COUNT=0;
    private static Singleton instance;
    private Singleton(){
        COUNT++;
    }

    public static Singleton getSingleton(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}