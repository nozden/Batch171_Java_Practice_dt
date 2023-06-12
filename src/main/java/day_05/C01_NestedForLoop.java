package day_05;

import java.util.Scanner;

public class C01_NestedForLoop {


    public static void main(String[] args) {

            /*
            Kullanıcıdan sisteme satır sayısını ve karakter girmesini isteyiniz.
            ve ardından kullanıcının girdiği karakteri kullanarak ikizkenar dik üçgen çizen
            bir method olusturun

            Satır sayısı = 4
            girilen karakter * ==>      *
                                        * *
                                        * * *
                                        * * * *
            */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satirSayisi= scan.nextInt();
        System.out.println("Lutfen kullanmak istediğiniz karakteri giriniz");
        char ch=scan.next().charAt(0);

        ucgenCiz(satirSayisi,ch);

    }

    public static void ucgenCiz(int satirSayisi, char ch) {
        /*

        *
        * *
        * * *

         */

        for (int i = 0; i < satirSayisi ; i++) {





            for (int j = 0; j <=i ; j++) {
                System.out.print(ch+" ");



            }
            System.out.println();



        }


    }




}
