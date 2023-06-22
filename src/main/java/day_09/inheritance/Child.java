package day_09.inheritance;

public class Child extends Parent{
    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız

    //bu classta tek parametreli, iki parametreli ve parametresiz obje olusturmak için
    //tek parametreli, iki parametreli ve parametresiz constructor olması gerekiyor


    protected Child(){
        //super(); //child olan her classta gorunmese bile bu ifade vardır
        //bu ifade parent classtaki parametresiz cons işaret eder
        System.out.println("child class parametresiz constructor");
    }

    protected Child(int a){
        super(5);
        System.out.println("child class tek parametreli cons");
    }

    protected Child(int a, int b){
        super(1,5);//super ifadesi ilk kod satırında olmalı
        System.out.println("child class iki parametreli cons");
    }
    //parenttaki cons ilgili ifade gecmiyorsa default olarak
    // super() yani parent class parametresiz cons calısır

    public static void main(String[] args) {

        //Child obj1=new Child();

        //Child obj2=new Child(1);

        Child obj3=new Child(1,5);
    }
}
