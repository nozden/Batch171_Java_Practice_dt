package day_03;

import java.util.Scanner;

public class C06_Ternary {


    //kullanıcıdan pozitif bir sayı alınız
    //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
    // ve yazdıran bir method olusturun

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 veya daha cok basamaklı pozitif bir sayı giriniz");
        int sayi=scan.nextInt();

        kacBasamakli(sayi);
        //main method içinden method olusturma
        //method ismi                +          (argument)
        //kendımız belirliyoruz     + method parantezi



    }


    public static void kacBasamakli(int sayi) {
        //bir sayı 99dan buyukse 3 veya daha cok basamaklıdır
        System.out.println(sayi > 99 ? "sayı 3 veya daha cok basamaklı" : "sayı 3ten az basamaklı");

    }


}
