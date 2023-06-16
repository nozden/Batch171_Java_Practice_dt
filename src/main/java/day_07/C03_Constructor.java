package day_07;

public class C03_Constructor {

    //bu classta parametreli constructor olusturunuz
    //ve farklı bir classtan deger ataması yapınız

    String marka;

    String model;

    int yil;

    String yakit;


    public C03_Constructor(String marka, String model, int yil, String yakit) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yakit = yakit;
    }
    //parametreli veya parametresiz herhangi bir cons olusturuldugunda
    //default cons ölür

    public C03_Constructor() {
    }


    //bir classaparametreli bir cons eklendiğinde mutlaka default cons benzer
    //parametresiz bir cons da eklenmeli

}
