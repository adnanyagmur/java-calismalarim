public class Main {

    public static void main(String[] args) {
        //referans tip
        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        //value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // referans tip olduğu için sayilar 1 ve sayilar 2 deki değişiklik birbirini etkilemekte
        int[] sayilar1 = new int[] {1,2,3};
        int[] sayilar2 = new int[] {4,5,6};
        sayilar2 = sayilar1;
        sayilar1[0] = 70;
        System.out.println(sayilar2[0]);
        sayilar2[1] = 11;
        System.out.println(sayilar1[1]);
        System.out.println(sayilar2[1]);
    }
}

