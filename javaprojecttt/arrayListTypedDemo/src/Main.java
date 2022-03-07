import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("araba");
        sehirler.add("sivas");
        sehirler.add("istanbul");
        sehirler.add("aydın");
        sehirler.add("hatay");
        sehirler.remove("adnan");

        sehirler.add("izmir");
        Collections.sort(sehirler);
        for(Object sehir: sehirler){
            System.out.println(sehir);
        }


        }
}
