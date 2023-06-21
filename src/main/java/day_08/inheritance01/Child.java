package day_08.inheritance01;

public class Child extends Parent{
    // STATİC VARİABLE'LARI VE STATİC METHODLARI
    // FARKLI BİR CLASS'DAN CAGIRABİLMEK İCİN CLASS İSMİ KULLANILIR.
    // FAKAT BU İKİ CLASS ARASINDA PARENT CHİLD İLİSKİSİ VARSA,
    // DİREK KULLANILABİLİR

    int yas=10;
    public static void main(String[] args) {
        //Math.abs(2)
        //Math classından abs() static methodunu class ismi ile cagırabiliyoruz
        method1();
        System.out.println(isim);
        isim="Veli";
        System.out.println(isim);

        System.out.println(soyisim);
        soyisim="Tan";
        System.out.println(soyisim);
        method2();

        //hem parenttaki hem de child daki yas variable ları instance
        //herhangi bir static yas variable yok
        //instance variablelar static methodlarda direk kullanılamadıkları için
        //yas variable ını da main methodda kullanamadık

        //child classtan obje olusturunuz
        Child obj1=new Child();
        System.out.println(obj1.yas);//10

        //Parent classtan obje olusturalım
        Parent obj2=new Parent();
        System.out.println(obj2.yas);
        //variableları ararken hep yukarı dogru bakarız
        obj2.method3();
        obj2.method4();


    }
}
