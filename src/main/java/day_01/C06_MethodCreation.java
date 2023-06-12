package day_01;

public class C06_MethodCreation {

    public static void main(String[] args) {

        //kare prizmanın hacmini bulan ve donduren bir method yazınız
        //not: kare prizma hacmi -> taban alanı x yukseklık -> a*a*h
        int tabanKenar=3;
        int yukseklik=4;
        // tabankenarı 3 yukseklıgı 4 olan prızmanın hacmı-> 3*3*4=36


        System.out.println(karePrizmaHacimBul(3, 4));
        System.out.println(karePrizmaHacimBul(tabanKenar, yukseklik));


    }

    //access mod + static + return type + isim (){}
    //public, default, private, protected
    public static int karePrizmaHacimBul(int tabanKenari, int yukseklik){

        int hacim=tabanKenari*tabanKenari*yukseklik;

        return hacim;
    }

}
