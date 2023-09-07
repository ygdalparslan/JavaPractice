package practice02;

import java.util.Scanner;

public class C07StringManipulations {

    public static void main(String[] args) {

        /*
        Kullanıcıdan ad ve soyadını aralarında bir boşluk olacak şekilde sisteme girmesini isteyin
        NOT: Yalnızca bir ad bir soyad girilmeli
        Ad ve Soyadı ilk harfleri büyük olacak şekilde yazdırın
        Ad : Canan
        Soyad : Can
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ad ve soyadınızı aralarında bir boşluk olacak şekilde sisteme girin."
                +"\nNOT: Yalnızca bir ad bir soyad girilmeli");

        String fullName = input.nextLine();

        int spaceIndex = fullName.indexOf(" ");
        String name =fullName.substring(0, spaceIndex);
        String surname = fullName.substring(spaceIndex+1);

        name = name.toUpperCase().charAt(0)+name.toLowerCase().substring(1);
        surname = surname.toUpperCase().charAt(0)+surname.toLowerCase().substring(1);

        System.out.println(name +"\n" +surname);

                







    }
}
