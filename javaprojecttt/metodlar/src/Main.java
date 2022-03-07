public class Main {

    public static void main(String[] args) {

        sayiBulmaca();


    }
    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 3, 5, 7, 8, 9};

        int aranacak = 6;

        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi == true) {
            mesajVer(aranacak);
        } else {
            System.out.println("bu dizide bu sayı YOK: " + aranacak);
        }
    }
    public static void mesajVer(int aranacak){
            System.out.println("sayi mevcuttur: "+aranacak);
        }

    }

