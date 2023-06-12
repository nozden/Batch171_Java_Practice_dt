package day_06;

import java.util.Arrays;

public class C01_Arrays {

    // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    //yeni bir array olusturmadan varolan arrayın işaretleri degişsin
    // input : 1,2,-3,4,-5,-6
    // output :-1,-2,3,-4,5,6

    public static void main(String[] args) {

       // int arr[]=new int[6]; bu sekılde elemanları default degerlerden olusan bir array olustururuz
        int arr[]={1,2,-3,4,-5,-6};//aynı satırda hem deklarasyon hem deger ataması yaparız

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length ; i++) {
          arr[i]=arr[i]*-1;
        }

        System.out.println(Arrays.toString(arr));
        //arr[index] bu sekılde arrayın elemanlarına ulasabılırız

        int index=0;
        for (int each:arr
             ) {
           arr[index]=arr[index] * -1;
           index++;
        }
        System.out.println(Arrays.toString(arr));


    }



}
