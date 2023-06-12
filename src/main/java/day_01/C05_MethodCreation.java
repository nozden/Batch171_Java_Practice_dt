package day_01;

public class C05_MethodCreation {

    public static void main(String[] args) {

        //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz

        //3 ve 5 ->34 yazdıracak
        //methodum sadece yazdırma ıslemı yapacak bu yuzden return type voıd olabılır


        kareTopla(3, 5);//argument
        kareTopla(10,100);
        kareTopla(4,9);

    }
    public static void kareTopla(int sayi1, int sayi2)//parametre diyoruz ve burada deklare ettıgımız variablelar
                                                      //method body kısmında kullanılabılır
    {
        int sonuc=sayi1* sayi1+ sayi2* sayi2;
        System.out.println(sonuc);




    }



}
