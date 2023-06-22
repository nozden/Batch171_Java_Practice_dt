package day_09.Arabalar;

public class Corsa extends Opel{

    //Corsa modeline ait spesifik özellikler bu classta tanımlayalım
    //daha sonra bu classta main method içinde objeler olusturalım

    String hiz="Corsa max 200km hiz yapar";

    String yakit="Corsa benzinli veya elektriklidir";

    String model="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketir");
    }
    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    //corsa classında obje olusturalım

    public static void main(String[] args) {
        //bir tane corsa objesi olusturalım
        //static bir methoddan instance datalara ulasmak için obje olusturum

        Corsa arb1=new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba classından
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//corsa
        System.out.println("arb1.marka = " + arb1.marka);//opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//opel
        System.out.println("arb1.model = " + arb1.model);//corsa
        arb1.motor();//corsa

        //bir tane opel araba olusturalım
        //bir opel objesi olusturalım
        Opel arb2=new Corsa();
        //data turu parent, constructor child olacak sekilde de obje olusturulabilir
        System.out.println("arb2.hareket = " + arb2.hareket);//araba
        System.out.println("arb2.hiz = " + arb2.hiz);//opel
        System.out.println("arb2.yakit = " + arb2.yakit);//araba
        System.out.println("arb2.marka = " + arb2.marka);//opel
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);//opel

        //arb2.model-->CTE verir

        arb2.motor();//Corsa

        /*
        inheritance da variable;
        aramaya data turu neyse oradan baslar,
        yoksa parenta bakar,
        ilk buldugu yerden alır
         */
        /*
        inheritance da methodlar;
        aramaya data turunden baslar,
        yoksa parenta bakar,
        ilk buldugu yerden almaz,
        constructor ın oldugu classa kadar override edilmiş mi diye bakar
         */
        //arama işlemi her zaman asagıdan yukarı dogru olur
        //override edilmiş mi diye yukarıdan asagı dogru bakılır
        arb2.garanti();//opel
        arb2.yakitTuketimi();//corsa
        //arb2.vitesSayisi -->CTE verir

        Araba arb3=new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);//araba
        System.out.println("arb3.hiz = " + arb3.hiz);
        System.out.println("arb3.yakit = " + arb3.yakit);
       // arb3.sirketMerkezi
        System.out.println(arb3.marka);

        arb3.yakitTuketimi();//corsa
        arb3.motor();//corsa

        //arb3.garanti-->CTE
        //arb3.vitesSayisi-->CTE

        Araba arb4=new Opel();

        arb4.motor();//opel
        //overriding kontrol edilirken constructorun
        //oldugu classa kadar bakılır


        //arb4.garanti-->CTE

        Araba obj1=new Araba();//method için override edilmiş mi diye kontrol etmeme gerek yok
        Araba obj2=new Opel();//methodu önce araba da bulmalıyım lazım sonra opele kadar override edilmiş miye bakmalıyım
        Araba obj3=new Corsa();//methodu önce araba da bulmalıyım lazım sonra corsaya kadar override edilmiş miye bakmalıyım

        Opel obj4=new Opel();
        Opel obj5=new Corsa();

        Corsa obj6=new Corsa();
    }
}
