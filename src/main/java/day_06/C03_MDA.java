package day_06;

import java.util.Arrays;
import java.util.Scanner;

public class C03_MDA {
           /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int arr[][]={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

    public static void main(String[] args) {
        int arr[][]=new int[3][2];    //{{0,0},{0,0},{0,0}} arr.lenght =3 olur

        Scanner scan=new Scanner(System.in);
      //arr[0][0]-> dıs arrayın 0. indexdeki elamannın 0. indexi demektir
        // arr[0][1]->dıs arrayın 0. indexdeki elemanının 1.indexi

        System.out.println(Arrays.deepToString(arr));

        for (int i = 0; i < arr.length ; i++) {//dıstaki arrayın her bir elemanını ele alırım
            for (int j = 0; j <arr[i].length ; j++) {
                //arr[i][j]---> arr[0][0]
                System.out.println("lutfen eklemek istediğiniz elemanı giriniz");
                arr[i][j]= scan.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(arr));
        int brr[]=new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {
            int toplam=0;
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
            }



            brr[i]=toplam;
        }


        System.out.println(Arrays.toString(brr));

    }
}
