package day_07;

public class C04_Constructor {

    public static void main(String[] args) {

        //instance bir variable ı static bir methodda kullanmak için mutlaka obje olusturmalıyız

        C02_Constructor obj1=new C02_Constructor();//buradaki default cons
        //class ismi aynı zamanda objemizin data turudur

        obj1.marka="Mercedes";
        obj1.model="C180";
        obj1.yil=2023;
        obj1.yakit="Benzin";

        System.out.println(obj1.marka);
        System.out.println(obj1.model);
        System.out.println(obj1.yil);
        System.out.println(obj1.yakit);

        C02_Constructor obj2=new C02_Constructor();

        System.out.println(obj2.marka);
        System.out.println(obj2.model);
        System.out.println(obj2.yil);
        System.out.println(obj2.yakit);


        //C03 e ait obje olusturalım

        C03_Constructor obj3=new C03_Constructor("Benz","C44",2020,"Benzin");

        System.out.println(obj3.marka);
        System.out.println(obj3.model);
        System.out.println(obj3.yil);
        System.out.println(obj3.yakit);

    }


}
