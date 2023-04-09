package Editor;

import ObserverPattern.EventManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Stack;

public class Belge {
    private File belge;
    private String isim;
    private Metin metin; //Aggregation.
    public EventManager events;

    public Belge() //Sadece metin değişkeni başlatılır, öbür değişkenler metotlarda başlatılacaktır.
    {
        metin=new Metin();
        events = new EventManager();
    }

    public void belgeOlustur(String adres) throws IOException
    {
        isim="Yeni_Belge.txt"; //Standard isim.
        belge=new File(adres+"/"+isim);
        events.notify("open", belge.getName());

        int sayac=1; //Eğer belgenin oluşturulacağı konumda aynı isimde bir txt dosyası varsa kullanılacaktır.
        while(!belge.createNewFile()) /*Belgenin oluşturulması istenilen konumda aynı isimli bir txt dosyası varsa belge kurulamıyacaktır. Kurulana kadar
                                        sayac değişkeni yardımıyla ardışık şeklinde sayılar artırılır ve standard belge isminin yanına koyulur. */
        {
            isim="Yeni_Belge(" + Integer.toString(sayac++) + ").txt";
            belge=new File(adres+"/"+isim);
        }
        metin=new Metin(); //Metin sıfırlanır.
    }

    public String belgeAc(String adres) throws IOException
    {
        belge=new File(adres);
        isim=belge.getName(); ///Açılacak txt dosyasının ismi alınır.
        metin=new Metin(Files.readString(Paths.get(adres))); //Açılacak txt dosyasındaki metin alınır.
        return metin.getMetin(); //GUIde kolaylık sağlamak için geriye belgenin metini döndürülür, sonradan GUInin JTextAreasına belirlenir.
        //Dependency
    }

    public void kapat() //Sıfırlama gerçekleşir.
    {
        belge=null;
        isim=null;
        metin=new Metin();
    }

    public void belgeKaydet(String adres) throws IOException
    {
        Files.writeString(Paths.get(adres), metin.getMetin()); //Dependency.
        events.notify("save", belge.getName());

    }


    public void bulDegistir(String bul, String degistir) //Metin sınıfındaki metot çağrılır.
    {
        metin.bulDegistir(bul, degistir); //Dependency.
    }

    public String geriAlma() //Metin sınıfındaki metot çağrılır.
    {
        return metin.geriAlma(); //Dependency.
    }

    public void aksiyonEkle(String yazi) //Metin sınıfındaki metot çağrılır.
    {
        metin.aksiyonEkle(yazi); //Dependency.
    }



    public String getIsim()
    {
        return isim;
    }

    public String icerigiAl()
    {
        return metin.getMetin(); //Dependency.
    }

    public void icerigiDegistir(String yeni_icerik)
    {
        metin.setMetin(yeni_icerik); //Dependency.
    }

    public Metin getMetin()
    {
        return metin;
    }

    public void setMetin(Metin metin)
    {
        this.metin = metin;
    }

    public void metinAksiyonlariBelirle(Stack<String> aksiyonlar)
    {
        metin.setAksiyonlar(aksiyonlar);
    }
}
