package day_03;

import java.util.Scanner;

public class C05_IfElse {

            /*
        Kullanıcıdan 3 karakterden daha uzun bir kelime sisteme girmesini isteyin
        Eger kelimenin karakter sayısı 3 ve 3'den daha kucuk ise konsola "
        3 Karakterden Daha Uzun Bir Kelime Girmelisiniz " yazdırınız
        Degilse kelimenin basına ve sonuna, kelimenin son uc harfini ekleyerek yazdırınız
         */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen uc karakterden daha uzun bir kelime giriniz");
        String kelime=scan.next();
        int uzunluk=kelime.length();

        if (uzunluk<=3){
            System.out.println("3 Karakterden Daha Uzun Bir Kelime Girmelisiniz");
        }else{
            String sonUc=kelime.substring(uzunluk-3);
            System.out.println(sonUc+kelime+sonUc);

        }
    }

}
