package day_08;

import java.util.Scanner;

public class C01_StringBuilder {

    public static void main(String[] args) {
        //kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
        //capasity lenght yazdırın
        //capasity i lenghte esıtleyın tekrar yazdırın
        //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
        //iki objeyi karsılastırın(== , equals , compareTo ile)
        Scanner                   scan=new Scanner(System.in);//scanner objesi olusturdum
        //data turu(class ismi)+isim  =    constructor
        //neden obje olusturduk--> next() instance methoduna ulasmak için
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        StringBuilder sb=new StringBuilder(kelime);//sb objesi olusturduk
        System.out.println(sb);
        System.out.println("sb.capacity() = " + sb.capacity());//parametresiz cons kullanırsak default deger 16,
                                                         // parametreli cons kullanırsak parametre olarak verdiğimiz
                                                         // string uzunlugu+16 olarak belirlenir
        System.out.println("sb.length() = " + sb.length());
        sb.trimToSize();//bu method capasiteyi lenght e esitler
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());

        //parametresiz cons
        StringBuilder sb2=new StringBuilder();
        sb2.append(kelime);
        System.out.println(sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());

        System.out.println(sb==sb2);//false
        System.out.println(sb.equals(sb2));//stringbuilder equals methodu hem referans hem degere bakar --> false
        System.out.println(sb.compareTo(sb2));//0
        /*
        compareTo methodu 0 veya farklı deger dondurur
        bizim için onemli olan 0 mı değil mi
        0 ise iki objenin degerleri aynı demektir
         */


    }
}
