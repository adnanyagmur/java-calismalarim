public class Main {

    public static void main(String[] args) {
        KronometreThread thread1 =  new KronometreThread("thred1");
        KronometreThread thread2 =  new KronometreThread("thred2");
        KronometreThread thread3 =  new KronometreThread("thred3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
