package day_06;

import java.util.ArrayList;
import java.util.List;

public class C05_List {
    public static void main(String[] args) {
         /*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)


          String[] arr = {"John","Brad","Angel","Sofia","Emily"};

          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]

         */
        String[] arr = {"John","Brad","Angel","Sofia","Emily"};

        String[] brr = {"sofia","brad","grace","emily","hazel"};

        List<String> ortakIsimler=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {//arr arrayındeki her bir eleman tek tek gelir

            for (int j = 0; j < brr.length ; j++) {//brr arrayındeki her bir elemanı tek tek aldım
                if (arr[i].equalsIgnoreCase(brr[j])){





                    ortakIsimler.add(brr[j]);//ortakIsimler.add(arr[i]) bu sekılde de olur
                }

            }
        }

        System.out.println(ortakIsimler);


    }
}
