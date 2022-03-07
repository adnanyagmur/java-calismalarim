public class Main {

    public static void main(String[] args) {
	double[] myList = {1,2,7,4,5.2,6};
    double total=0;
    double max = myList[0];
    for(double sayi:myList){
        if(max<sayi){
            max = sayi;
        }
        total= total+ sayi;
        System.out.println(sayi);
    }
    System.out.println("toplam :"+total);
        System.out.println("enbüyük :"+max);
    }
}
