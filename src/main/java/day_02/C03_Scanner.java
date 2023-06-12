package day_02;

import java.util.Scanner;

public class C03_Scanner {

    //ctrl alt L duzenleme
    //ctrl z -> işlemi geri alma

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);//scanner objesı olusturdum ismine input verdim
        System.out.println("Lutfen birinci sayıyı giriniz");
        int x = input.nextInt();
        System.out.println("Lutfen ikinci sayıyı giriniz");
        int y = input.nextInt();

        boolean sonuc= karelerEsitMi(x,y);
        System.out.println("sonuc = " + sonuc);

    }

    private static boolean karelerEsitMi(int x, int y) {
        //javada = isaret assignment(atama) isaretidir
        //matematiksel anlamdaki esıt için == kullanırız
        boolean sonuc= x*x==y*y;

        return sonuc;

    }


}
