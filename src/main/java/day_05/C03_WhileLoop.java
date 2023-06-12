package day_05;

import java.util.Scanner;

public class C03_WhileLoop {

    // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
    // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
    //or: 5!=1*2*3*4*5

    //3! --> 1*2*3 =6
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen faktoryelini bulmak istediğiniz sayıyı giriniz");
        int sayi= scan.nextInt();
        int carpim=1;


        int baslangic=1;
        while (baslangic<=sayi){

            carpim=baslangic*carpim;

            baslangic++;
        }


        System.out.println(sayi+"! = "+carpim);
    }

}
