import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();
        System.out.println(sayilar.size());
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("adnan");
       //System.out.println(sayilar.size());
       // System.out.println(sayilar.get(2));
       // sayilar.set(0,100);    // index e sayı GÜNCELLEME
       // System.out.println(sayilar.get(0));
       // System.out.println("sayilar:"+sayilar);
        //sayilar.remove(0);     // silme operasyonu
        //System.out.println("sayilar:"+sayilar);
        //sayilar.clear(); hespini silmek
        for(Object array:sayilar){
            System.out.println(array);
        }
        System.out.println(sayilar.size());


    }
}
