package Editor;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Metin {
    private String metin; //Belirli işlemlerde karışıklık oluşturmamak için oluşturulmuştur.
    private Stack<String> aksiyonlar=new Stack<>(); //Geri alma işleminde kullanılacaktır.





    public Metin()
    {
        metin="";

        aksiyonlar.add(metin);
    }

    public Metin(String metin)
    {
        this.metin=metin;

        aksiyonlar.add(metin);
    }



    public void bulDegistir(String bul, String degistir) //Büyük küçük harf ayrımı yapmaz.
    {
        Boolean degisiklik_olustu_mu=false;
        String depolanan_karakterler=""; //Kuyruk mantıyla kullanılır.
        int metin_uzunlugu=metin.length();

        for(int indeks=0;indeks<metin_uzunlugu;indeks++)
        {
            Character karakter=metin.charAt(indeks);

            if(Character.isDigit(karakter)|| Character.isLetter(karakter) || karakter.equals('-'))
                depolanan_karakterler+=karakter.toString();

            else
            {
                if(depolanan_karakterler.length()==0)
                    ;

                else if(depolanan_karakterler.equalsIgnoreCase(bul)) //Kontrol sırasında küçük büyük harf ayrımı yapılmaz.
                {
                    metin=metin.substring(0, indeks-bul.length())+degistir+metin.substring(indeks);
                    metin_uzunlugu=metin.length(); //Uzunluk değişir.
                    indeks=indeks-bul.length()+degistir.length()-1; //indeks değişir, sonuna -1 koyulur ki else iften çıktıktan sonra +1leyerek kalınan yerden devam eder.
                    depolanan_karakterler="";
                    degisiklik_olustu_mu=true;
                }

                else
                    depolanan_karakterler="";
            }
        }

        if(depolanan_karakterler.equalsIgnoreCase(bul)) //Boş veya dolu durumu için geçerli.
        {
            metin=metin.substring(0, metin_uzunlugu-bul.length())+degistir;
            degisiklik_olustu_mu=true;
        }

        if(degisiklik_olustu_mu)
            aksiyonlar.add(metin);
    }


    public void aksiyonEkle(String yazi) //Metin güncellemesi gerçekleşirse yeni durumu yığıt yapısına eklenir.
    {
        aksiyonlar.add(yazi);
    }

    public String geriAlma()
    {
        if(aksiyonlar.size()>0) //Bir aksiyon geçmişi var ise.
        {
            metin=aksiyonlar.pop(); //Projede ileri al işlevi istenilmediğinden dolayı stack yapısı kullanılmıştır ki geri al işlevinde kolaylık sağlar.
        }
        return metin;
    }

    public void setMetin(String metin)
    {
        this.metin = metin;
    }

    public String getMetin()
    {
        return metin;
    }

    public void setAksiyonlar(Stack<String> aksiyonlar)
    {
        this.aksiyonlar = aksiyonlar;
    }

    public Stack<String> getAksiyonlar()
    {
        return aksiyonlar;
    }
}
