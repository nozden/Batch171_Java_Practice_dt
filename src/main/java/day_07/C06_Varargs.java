package day_07;

public class C06_Varargs {

    // kac tane kelime verilirse verilsin
    // iclerinden en uzun olanı yazdıran bir method olusturun
    // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

    public static void main(String[] args) {

        String str1="Ali";
        String str2="Abdullah";
        String str3="Ahmet";
        String str4="Veli";
        //String str5="Abdurrahman";

        System.out.println(enUzunKelime(str1, str2, str3, str4));

    }

    private static String enUzunKelime(String... str) {//parametre kısmını array olarak dusunelım
        //bu method bana en uzun kelimeyi dondursun istiyorum
        //bu yuzden return type degıstırıyorum
        //veya istersek return type void olarak bırakıp en uzun kelimeyi methodun içinde yazdırırız

        String enUzunKelime="";//en uzun kelimeyi koyacagım konteyner olusturdum

        for (String each:str
             ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }


        return enUzunKelime;

    }


}
