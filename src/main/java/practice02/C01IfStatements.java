package practice02;

import java.util.Scanner;

public class C01IfStatements {
    public static void main(String[] args) {
//kullanıcıdan iki sayı isteyin
//sayıların ikiside pozitif ise sayıların toplamını yazdırın
//sayıların ikiside negatif ise sayıların çarpımıı yazdırın
//ikisi farklı işaretlere sahipse sayılarla işlem yapamazsın
//sayılardan sıfıra eşit olan varsa çarpmaya göre yutan eleman yazdırın

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz..");

        int firstNum = input.nextInt();
        int secondNum = input.nextInt();


        if (firstNum > 0 && secondNum > 0) {
            System.out.println(firstNum + secondNum);
        } else if (firstNum < 0 && secondNum < 0) {
            System.out.println(firstNum * secondNum);
        } else if (firstNum ==0 || secondNum==0) {
            System.out.println("Çarpmaya göre yutan eleman");
        }else {
            System.out.println("İşlem yapılamaz");
        }

    }


}
