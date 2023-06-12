package day_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_List {
        /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(list);

        for (int i = 0; i < list.size() ; i++) {//listin elemanlarini index 0dan baslayarak tek tek aldık

            if (list.get(i)>10){//listin i. indexteki elemanını alalım ve 10dan buyuk mu diye bakalım
                list.set(i,list.get(i)*2);//eger kosul saglanıyorsa listin gelen elemanı 2 ile carpılarak gncellenecek
            }

        }


        System.out.println(list);

    }
}
