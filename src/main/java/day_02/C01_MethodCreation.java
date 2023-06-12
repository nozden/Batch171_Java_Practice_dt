package day_02;

import java.util.Scanner;

public class C01_MethodCreation {

    // Fahrenheit değeri, Celsius değere çeviren method yazınız.
    // formül: c = (f-32)/1.8
    //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

    public static void main(String[] args) {

        //kullanıcıdan fahrenheit bir deger alalım
        //scanner objesı olusturalım
        Scanner scan= new Scanner(System.in);
        //kullanıcıya bir mesaj verelim
        System.out.println("Lutfen fahrenheit cinsinden bir sicaklik giriniz");
        double fahrenheit=scan.nextDouble();// kullanıcının girmis oldugu veriyi fahrenheit varible'ına koydum


        double celsius=fahrToCels(fahrenheit);
        System.out.println("fahrenheit = " + fahrenheit);
        System.out.println("celsius = " + celsius);

    }

    private static double fahrToCels(double fahrenheit) {


        double celsius=(fahrenheit-32)/1.8;
        return celsius;


    }


}
