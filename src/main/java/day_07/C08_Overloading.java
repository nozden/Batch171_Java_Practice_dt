package day_07;

public class C08_Overloading {

    //method signature : method ismi ve parametreler
    //overloading aynı isme sahip farklı methodlar olusturmaktır
    //overloading için method signature degıstırılmeli, yani isim aynı kalacagı için parametreler degıstırılmeli

    public static void main(String[] args) {
        // Aynı classta aynı isimde method olusturunuz
        //toplama methodu->int + int
        //toplama methodu->double + double
        //carpma methodu ->int*int*int
        //carpma methodu ->int*int*int*int
        //cikarma methodu->int-double
        //cikarma methodu->double-int


        toplama(3,5);

        toplama(3.5,5.1);

        //method signature degisrmenin
        //1.yolu : parametrelerin data turunu degıstırmek

        carpma(1,2,3);
        carpma(1,2,3,4);
        //method signature degisrmenin
        //2.yolu : parametre sayısını degıstırmek

        cikarma(5,3.2);
        cikarma(6.2,3);
         //method signature degisrmenin
        //3.yolu : data turleri farklı oldugunda parametrelerin yerini degistirmek

    }

    private static void cikarma(double v, int v1) {
        System.out.println("Ilki double ikincisi int iki degerin farkı : "+(v-v1));

    }

    private static void cikarma(int i, double v) {
        System.out.println("Ilki int ikincisi double olan iki degerin farkı : "+(i-v));
    }

    private static void carpma(int a, int b, int c, int d) {

        System.out.println("Dort int degerin carpımı : "+ (a*b*c*d));


    }

    private static void carpma(int i, int i1, int i2) {

        System.out.println("Uc int degerin carpımı : "+(i*i1*i2));
    }

    private static void toplama(double v, double v1) {

        System.out.println("iki double degerin toplami : "+ (v+v1));

    }

    private static void toplama(int i, int i1) {

        System.out.println("iki int degerin toplami : "+(i+i1));

    }


}
