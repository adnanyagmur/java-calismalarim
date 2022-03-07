public class Main {

    public static void main(String[] args) {
	    DortIslem dortIslem = new DortIslem();
        int toplam = dortIslem.topla(1,2,3,4);
        System.out.println(toplam);
        int cikarma = dortIslem.cıkarma(9,8);
        System.out.println(cikarma);
        int carp = dortIslem.carpma(1,2,3,4,5,6);
        System.out.println(carp);
        int bol = dortIslem.booolme(5,5);
        System.out.println(bol);


    }
}
