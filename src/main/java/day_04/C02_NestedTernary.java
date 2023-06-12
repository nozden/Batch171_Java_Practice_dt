package day_04;

import java.util.Scanner;

public class C02_NestedTernary {
            /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */
            public static void main(String[] args) {
                Scanner scan=new Scanner(System.in);
                System.out.println("Lutfen bir karakter giriniz");
                char ch=scan.next().charAt(0);

                //ascii tablosunu kullanarak a-z arasını ve A-Z arasını alarak bir kontrol saglarım
                //ch'nin a-z aralıgında olması;-->  ch>='a' && ch<='z'
                //ch'nin A-Z aralıgında olması demek --> ch>='A' && ch<='Z'

                System.out.println( (ch>='a' && ch<='z')||(ch>='A' && ch<='Z') ? (ch>='a' && ch<='z' ? "Kucuk Harf" :"Buyuk Harf") :
                        ("Harf Degil"));



            }


}
