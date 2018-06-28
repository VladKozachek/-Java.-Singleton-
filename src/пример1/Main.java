package пример1;

public class Main {
    public static void main(String[] args) {

        final  int SIZE=1000;
        Singleton arr[] =new Singleton[SIZE];

        for (int i=0;i<SIZE;i++){
            arr[i]=Singleton.getSingleton();
        }
        System.out.println(Singleton.COUNT);

    }
}
