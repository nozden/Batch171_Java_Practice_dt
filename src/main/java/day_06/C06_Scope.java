package day_06;

public class C06_Scope {

    /*
    scope kapsam anlamına gelir, bir variable ın nerede gecerli oldugunu bıldırır

    4 cesıt scope vardır

    1-static variablelar=class variablelar
    2-instance variablelar= object variablelar
    -- static ve instance variablelar class levelda olusturulur
    3-local variablelar=methodların ıcınde olusturdugumuz variablelar ve methodun ıcınde gecerli olur
    4-loop variable=loopun ıcınde olusturdugumuz variablelar ve loopun icinde gecerli olur

     */


    static int staticSayi;//deger ataması yapmadıgımız zaman java bunlara otomatik default degerler atar
    int instanceSayi;



    public static void main(String[] args) {
        int localSayi=0;//java local variablelara default deger atamaz

        for (int i = 0; i <3 ; i++) {
            System.out.println(i);//buradaki i loop variable dır
        }
        //System.out.println(i);
        System.out.println(staticSayi);
        //System.out.println(instanceSayi);
        //instance bir variable static bir methodda direk kullanılamaz
        //kullanabilmek için obje olusturmalıyız
        C06_Scope obj=new C06_Scope();
        System.out.println(obj.instanceSayi);

    }



}
