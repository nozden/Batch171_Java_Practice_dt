package day_04;

import java.util.Scanner;

public class C04_Switch {
            /*

         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

              seviyesini yazdırınız

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz

             harf notunu yazdırınız
        */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 0-4 arası puanınızı giriniz");
        double puan=scan.nextDouble();

        String seviye="";


        if (puan<0 || puan>4)//puan 0dan kucuk veya 4 ten buyuk ise hata mesajı versin
        {
            System.out.println("0-4 arası bir puan girmelisiniz");
            seviye="YOK";
        } else if (puan<1) {
            seviye="KALDI";
        } else if (puan<2) {
            seviye="GECTI";
        } else if (puan<2.5) {
            seviye="IYI";
        } else if (puan<3.5) {
            seviye="UST";
        } else {
            seviye="HARIKA";
        }
        System.out.println("seviye = " + seviye);

        char harfNotu=' ';


        switch (seviye){

            case "KALDI" :
                harfNotu='F';break;
            case "GECTI" :
                harfNotu='D';break;
            case "IYI":
                harfNotu='C';break;
            case "UST":
                harfNotu='B';break;
            case "HARIKA":
                harfNotu='A';break;
            default:
                System.out.println("hatalı giriş");
                harfNotu='x';
        }

        System.out.println("harfNotu = " + harfNotu);


    }
}
