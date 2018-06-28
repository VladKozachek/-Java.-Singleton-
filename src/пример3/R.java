package пример3;

import пример3.Singleton;

public class R implements Runnable {
    @Override
    public void run() {
        Singleton.getSingleton();
    }
}
