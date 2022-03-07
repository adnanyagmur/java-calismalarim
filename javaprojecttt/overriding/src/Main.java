public class Main {

    public static void main(String[] args) {

        BaseKredimanager[] krediManagers = new BaseKredimanager[]
                {new OgretmenKrediManager(), new TarimKrediManager(),new OgrenciKrediManager()};

        for (BaseKredimanager krediManager: krediManagers ){
             System.out.println(krediManager.hesapla(2000));

        }


    }
}
