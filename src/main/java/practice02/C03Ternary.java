package practice02;

import java.util.Scanner;

public class C03Ternary {
    public static void main(String[] args) {

/*Kullanıcıdan bir sayı sisteme girmesini isteyin
Ternary kullannarak;
Girilen sayı çift ise " Çift Sayı" yazdırın
Girilen sayı tek ise girilen sayıyı 3 artırarak konsola yazdırın
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz.");

        int num = input.nextInt();
        Object result = num % 2 == 0 ? "Çift Sayı" : num + 3;

        System.out.println(result);

    }
}
