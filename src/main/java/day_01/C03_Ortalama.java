package day_01;

public class C03_Ortalama {

    public static void main(String[] args) {

   /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

        double num1=23.4;
        double num2=24;
        double num3=12;
        double num4=450.3;
        double num5=100;

        //ortalama nasıl hesaplanır -> tum sayıları topla, sayı adedine bol


        double toplam= num1 + num2 + num3 + num4 + num5;
        //ifadenin onunda string varsa + ısreti yan yana yazdırma ıslemı yapar
        //+ isretini onunde strıng yoksa ve numerıc datalar varsa + işareti matematıksel toplama ıslemı yapar
        System.out.println("toplam = " + toplam);//609.7
        double ortalama = toplam / 5;
        System.out.println("ortalama = " + ortalama);//121.94000000000001


        System.out.println((num1 + num2 + num3 + num4 + num5)/5);




    }



}
