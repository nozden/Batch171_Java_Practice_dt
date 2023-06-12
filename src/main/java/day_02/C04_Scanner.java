package day_02;

import java.util.Scanner;

public class C04_Scanner {
    //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */

    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        //char data turunde bır veri almak istoyorum
        //ancak scanner objesının(girdi) methodlarına bakınca nextChar diye bir
        //methodun olmadıgını gorduk
        //scanner ile char almak istiyorsak önce string olarak alırız -> (next() methodu ile)
        //daha sonra bu stringin charat(0) methodu ile 0. indexindeki karakteri alırız

        char ch = girdi.next().charAt(0);//0 burada 0. index demek, stringlerde index yapısı vardır ve sıfırdan baslar
        System.out.println("ch = " + ch);

        System.out.println("======================================");
        /*
          A     -> 2 bosluk+ ch + 2 bosluk
         A A    -> 1 bosluk +ch +1 bosluk + ch + 1 bosluk
        A A A   -> ch + 1bosluk + ch + 1bosluk +ch
        */

        //konsolda bosluk(space) gormek icin mutlaka bı spacelerın "" ıcınde olması gerekır
        //"" dısındaki bosluklar önemsizdir
        System.out.println("  "+                ch             + "  ");
        System.out.println(" "+ ch + " " + ch + " ");
        System.out.println(ch+ " "+ ch + " "+ ch);

        System.out.println("=============================");
        //tek sout ile yapmak istesem -> \n ile yaparız -> imleci bir alt satıra gecirir ve "" içinde yazilir
        System.out.println("  "+ ch+ "  \n " + ch + " "+ ch + " \n" +ch +" "+ ch + " "+ ch);





    }




}
