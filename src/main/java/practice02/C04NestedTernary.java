package practice02;

import java.util.Scanner;

public class C04NestedTernary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan ayrı ayrı iki tamsayı isteyin
        Ternary kullanarak;
        Ssyılar bir birine eşit ise konsola "Sayılar Biribrine Eşit" yazdırın
        Sayılar birbirine eşit değil ise büyuk olan sayıyı ekrana yazdırın
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki tamsayı giriniz");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        Object result = num1==num2 ? "Sayılar Biribrine Eşit" : num1>num2 ? num1 : num2;
        System.out.println(result);
    }
}
