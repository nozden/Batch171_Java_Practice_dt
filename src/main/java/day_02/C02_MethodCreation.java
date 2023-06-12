package day_02;

import java.util.Scanner;

public class C02_MethodCreation {
             /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

    public static void main(String[] args) {

        /*
        amac:
        1 scanner kullanmak
        2 method olusturmak
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayıyı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayıyı giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);

        //main method ıcınden method olustururken
        //1. methoda verecegın ismi yaz(ozelısım)
        //2. method parantezini koy
        //3.parantezin içine varsa argumentlerini yaz
        swaplaYazdir(sayi1, sayi2);//main methodun icinde argument

    }

    private static void swaplaYazdir(int sayi1, int sayi2) //parametre
    {
        int sayi3;
        sayi3 = sayi1;//burdan sonra sayi1 i bosaltabilirim degistirebilirim sayi3 =10
        sayi1 = sayi2;//sayi1 de 20 var, sayi2 yi degıstırebılırım
        sayi2 = sayi3;//sayi2 10 olmus oldu

        System.out.println("swaptan sonra sayi1 : " + sayi1);
        System.out.println("swaptan sonra sayi2 : " + sayi2);


    }


}
