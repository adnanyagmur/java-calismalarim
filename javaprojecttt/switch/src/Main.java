public class Main {

    public static void main(String[] args) {

        char grade ='A';

        switch(grade){
            case 'A' :
                System.out.println("MİKKEMMEEL Geçtiniz");
                break;
            case 'B':
                System.out.println("güzel Geçtiniz");
                break;
            case 'C':
                System.out.println("EH İŞTE Geçtiniz");
                break;
            case 'D':
                System.out.println("SON ANDA Geçtiniz");
                break;
            case 'F':
                System.out.println("KALDIN DOSTUM");
                break;
            default:
                System.out.println("geçersiz not girdiniz");

        }
    }
}
