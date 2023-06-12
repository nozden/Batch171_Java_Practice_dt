package day_05;

import java.util.Scanner;

public class C02_NestedForLoop {

    /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

    örnegin: Satır Sayısı 4 icin;

     1
     2 3
     4 5 6
     7 8 9 10


     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen satir sayısını giriniz");
        int satir= scan.nextInt();

        int a=1;

        for (int i = 0; i <satir ; i++) {//her bir satır için calisacak


            for (int j = 0; j <=i ; j++) {//satırlara yazdıgımız her bir sayı icin calısacak
                System.out.print(a+" ");
                a++;
            }

            System.out.println();

        }


    }
}
