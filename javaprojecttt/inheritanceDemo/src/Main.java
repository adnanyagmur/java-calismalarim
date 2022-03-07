public class Main {

    public static void main(String[] args) {
	OretmenKrediManager oretmenKrediManager = new OretmenKrediManager();
    oretmenKrediManager.Hesapla();
    tarimKredimanager tarimKredimanager = new tarimKredimanager();
    tarimKredimanager.Hesapla();

    // böyle yaparsak kolaylık sağlar ve hata almayız !!
    KrediUI krediUI = new KrediUI();
    krediUI.KrediHesapla(new OretmenKrediManager());
    krediUI.KrediHesapla(new tarimKredimanager());
    krediUI.KrediHesapla(new AskerKredisi());
    }
}
