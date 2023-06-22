package day_09;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    // Verilen bir array'den tekrar eden elemanları silip
    // unique elemanlardan olusan bir array haline donusturen method olusturun
    // int arr[]={1,2,2,3,4,4,5};-->{1,2,3,4,5}
    public static void main(String[] args) {

        int arr[]={1,2,2,3,4,4,5,4,2,0,7,1};
        System.out.println(Arrays.toString(arr));//[1, 2, 2, 3, 4, 4, 5, 4, 2, 0, 7, 1]
        //method olusturalım

        benzersizYap(arr);

    }

    private static void benzersizYap(int[] arr) {
        //set tekrarsız elemanlardan olusur
        //bir set konteyneri olusturup arrnin elemanlarını sete ekleyelim
        //set tekrarlı eleman kabul etmeyecegı için tekrarsız bir kume elde etmiş olacagız

        Set<Integer> tekrarsiz=new TreeSet<>();//treeSet natural ordera gore sıralama yapar

        for (int each:arr
             ) {
            tekrarsiz.add(each);//set tekrarli eleman kabul etmeyecegı için if-else ile kontrol etmeme gerek yok
        }

        System.out.println(tekrarsiz);

    }


}
