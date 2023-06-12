package day_06;

import java.util.Arrays;

public class C02_Arrays {
     /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */

    public static void main(String[] args) {

        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        //int arr[]
        //sort methodu array elemanlarını natural order a gore sıralar(alfabetik/ kucukten buyuge)

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);//arr arrayı kucukten buyuge sıralanmıs oldu

        System.out.println(Arrays.toString(arr));

        System.out.println("minimum : "+ arr[0]);
        System.out.println("maksimum : "+ arr[arr.length-1]);//[] parantezin içine index yazmamız gerekiyor, son index arr.lenght-1 dir
        System.out.println("ikinci maksimum : "+ arr[arr.length-2]);


    }
}
