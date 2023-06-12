package day_01;

public class C01_Variables {



    public static void main(String[] args) {

        //yorum
        /*
        yorum
        yorum
        yorum
         */


        //Bir variable olustur, yazdır
        //syntax: data turu + datanın ismi =(atama operatoru) variable degeri
        int yas = 35;
        int sayi= 50;

        System.out.println(yas);//ln -> line next yani işlemi yap ve alt satıra gec
        System.out.println(sayi);

        //sayi = 50 seklinde yazdır, yani etiketiyle birlikte yazdır
        System.out.println("sayi = " + sayi);
        System.out.println("sayi = " + sayi);//soutv degıskenı etiketiyle birlikte yazdırma işlemi yapar

        //String bir data olusturalım -> non primitive
        String isim="Ali";//etiketiyle birlikte yazdır (isim = Ali seklınde)
        System.out.println("isim = " + isim);


        //Olusturdugun variable'ı farkli bir variable'a kopyala
        int benimYasim = yas;  //benimYasim olarak degıstır
        System.out.println("benimYasim = " + benimYasim);
        String onunIsmi= isim; //onunIsmi
        System.out.println("onunIsmi = " + onunIsmi);

        /*

        camelCase
        PascalCase
        snake_case
        kebab-case
         */


        //Aynı satırda coklu variable deklare et
        int yil= 2023 , ay= 4, gun=21;
        System.out.println("yil = " + yil);

        //Bir variable degerini guncelle
        yil=2024;
        System.out.println("yil = " + yil);//java yukarıdan asagı ve soldan saga calısır, java run time programming
        //Degişkenleri(variable) yazdır



        //Bir variable deklere et : x
        double x;

        //Bir variable baslat : y (initialize)
        double y =12.5;

        //Başka bir variable başlat : z degeri 33 olsun
        double z = 33;// java bunu 33.0 olarak algıladı

        //x degişkenini y degişkeni ile başlat
        x =y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //Variable y'i guncelle -> 14.9 olarak guncelle
        y =14.9;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        //Degişkenleri yazdır



    }



}
