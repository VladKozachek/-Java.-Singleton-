package пример4;

public class R implements Runnable {
    @Override
    public void run() {
        Singleton.getSingleton();
    }
}
