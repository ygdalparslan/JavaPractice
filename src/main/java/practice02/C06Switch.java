package practice02;

import java.util.Scanner;

public class C06Switch {
    public static void main(String[] args) {
        /*
        Kullanıcının yıl ve ay numarasını ayrı ayrı sisteme girmesini isteyiniz.
        Girilen ay numarasına göre ayin kaç gün çektiğini yazdırınız.


            NOT: 1, 3, 5, 7, 8, 10, 12, aylar 31 çeker
                 4, 6, 9, 11, aylar 30 gün çeker
                 2. ay 4 yılda bir 29 gün çeker diğer yıllarda 28 gün çeker.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yıl giriniz");
        int year = input.nextInt();

        System.out.println("Lütfen ay giriniz");
        int mounth = input.nextInt();

        switch (mounth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("31");
                break;
            case 2:
                if (year % 4 == 0) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir ay numarası giriniz");
        }

    }


}
