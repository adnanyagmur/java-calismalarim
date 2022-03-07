public class DortIslem {

    public int topla (int... sayilar){
        int toplam = 0;

        for(int sayi:sayilar){
            toplam = toplam + sayi;
        }
        return toplam;
    }
    public int cıkarma (int sayi1,int sayi2){

       return sayi1+sayi2;
    }
    public int booolme (int buyuksayi,int kucuksayi){

        return buyuksayi/kucuksayi;
    }
    public int carpma (int... sayilar) {
        int toplam = 1;

        for (int sayi : sayilar) {
            toplam = toplam * sayi;
        }
        return toplam;
    }


}
