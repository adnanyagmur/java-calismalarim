public class Main {

    public static void main(String[] args) {

        // 6 -------- 3,2,1 e bölünür toplamları da 6 yapar
        // 28--- 1 ,2,4,7,14 toplamı 28 bunlar mükkemmel sayı

        int number = 28;
        int total = 0;

        for(int i = 1;i<number;i++){
            if(number % i ==0){
                total = total+i;
            }
        }
        if(total == number){
            System.out.println("mükkemmel sayıdır");
        }else{
            System.out.println("mükkemmel sayı DEĞİLDİR");


        }

    }
}
