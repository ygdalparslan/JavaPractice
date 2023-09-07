package practice04;

import java.util.Arrays;
import java.util.Scanner;

public class C09Odev {
    public static void main(String[] args) {

        /*
        Kulanıcıdan alınan bir tam sayı kadar(47den kucuk olmak kosuluyla)
        FIBONACCI dizisi olusturun
        Ör: sayi=10 için
        0-1-1-2-3-5-8-13-21-34 gibi
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 47 den küçük bir sayı giriniz");
        int sayi = scan.nextInt();



        int[] arr = new int[sayi];
        arr[0] = 0;
        arr[1] = 1;

        if (sayi<47){
            for (int i = 2; i < sayi; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
            System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        }else System.out.println("Girdiğiniz sayı 47 den küçük değil");




    }
}
