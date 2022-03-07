public class Main {

    public static void main(String[] args) {

    String sehir = sil();
    System.out.println(sehir);
    int toplama = topla(5,6);
    System.out.println(toplama);
    int toplam = topla2(1,2,3,5,6,9,74);
    System.out.println(toplam);

    }

    public static String sil(){
        return "ankara";
    }
    public static int topla(int sayi1,int sayi2){
        return sayi1+sayi2;

    }
    public static int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam = toplam+ sayi;
        }
        return toplam;
    }
}
