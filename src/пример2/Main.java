package пример2;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final  int SIZE=1000;
        Thread threads[]=new Thread[SIZE];

        for (int i=0;i<SIZE;i++){
          threads[i]=new Thread(new R());
          threads[i].start();
        }
        for (int i=0;i<SIZE;i++){
           threads[i].join();
        }
        System.out.println(Singleton.COUNT);

    }
}
