package day_03;

import java.util.Scanner;

public class C01_Substring {
    /*
    Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
    NOT: Yalnızca bir ad bir soyad girilmeli
    Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
    Ad : Canan
    Soyad : Can
     */

    public static void main(String[] args) {

        //kullanıcıdan veri alacagımız ıcın scanner objesi olusturduk
        Scanner scan=new Scanner(System.in);
        //kullanıcıya mesaj verdik
        System.out.println("Lutfen ad ve soyadınızı aralarında bir bosluk olacak sekilde girin\n" +
                "Yalnızca bir ad bir soyad girilmeli");
        String adSoyad=scan.nextLine();
        System.out.println(adSoyad);
        //substring methodunun 2 formu var
        //1. substring(index)-> index dahil olmak uzere stringin sonuna kadar olan kısmı yeni bir string olarak dondurur
        //2. substring(index1,index2)->index1 dahil, index2 hariç olmak uzere yeni bir string dondurur
        int spaceIndex=adSoyad.trim().indexOf(" ");
        //adSoyad variable'nin ilk space kadar olan kısmını ad isimli String bir variable'a koyduk
        String ad=adSoyad.substring(0,spaceIndex);// sıfır dahil, spaceIndex haric
        System.out.println(ad);
        String soyad=adSoyad.substring(spaceIndex+1);
        System.out.println(soyad);
        //ad isimli variable'in ilk karakterini buyuk harf olacak sekılde alalım
        char adIlkHarf=ad.toUpperCase().charAt(0);//ad variable'nın ilk harfini buyuk olarak aldım
        //ad isimli variable'in geri kalan kısmını kucuk harf olarak alalım
        String adGeriKalan=ad.substring(1).toLowerCase();
        ad=adIlkHarf+adGeriKalan;//concatenation
        System.out.println(ad);

        //soyad isimli variable ın ilk harfini buyuk olarak alalım
        char soyadIlkHarf=soyad.toUpperCase().charAt(0);
        String soyadGeriKalan=soyad.substring(1).toLowerCase();
        soyad=soyadIlkHarf+soyadGeriKalan;//concatenation

        System.out.println("Ad : "+ ad);
        System.out.println("Soyad : "+soyad);


    }




}
