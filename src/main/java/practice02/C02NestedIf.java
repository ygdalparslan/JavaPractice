package practice02;

import java.util.Scanner;

public class C02NestedIf {

    public static void main(String[] args) {
/*
Kullanıcıdan sisteme bir numara girmesini isteyin.
Eğer numara sıfırdan küçükse konsola "Negatif Sayı" yazdırın.
Değilse 10'dan küçük olup olmadığına bakın. 10' dan küçükse konsola "Rakam" yazdırın,
10'dan büyük veya eşit ise konsola "Pozitif Sayı" yazdırın.

 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı Giriniz...");

        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Negatif Sayı");
        } else {
            if (num < 10) {
                System.out.println("Rakam");
            } else {
                System.out.println("Pozitif Sayı");
            }

        }

    }
}
