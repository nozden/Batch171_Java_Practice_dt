package day_08.inheritance01;

public class Baby extends Child{

    int kilo=45;//basında static yazmadıgı için instance dir
    public static void main(String[] args) {

        //static variable ve methodlar direk kullanılabilir

        System.out.println(isim);
        System.out.println(soyisim);
        method1();
        method2();

        //instance datalara ulasabilmek için obje olusturalım
        Baby obj=new Baby();
        System.out.println(obj.yas);//10
        //Child class objesi olusturalım
        Child obj2=new Child();
        //obj2.kilo
        //child classta kilo variable yok
        //Parent classa da bakar, Parent classta da kilo yok
        //bu yuzden hata verir, obje hangi classtan olusturulduysa
        //o classa ve onun parentlarına bakar, asagı dogru bakmaz

    }
}
