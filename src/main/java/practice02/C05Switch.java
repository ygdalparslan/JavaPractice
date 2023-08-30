package practice02;

import java.util.Scanner;

public class C05Switch {
    public static void main(String[] args) {
/*
Kullanıcıdan 0-4 arası sınav puanını sisteme girmesini isteyiniz.
Eğer    puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
        puanı 1,0-2,0 arasında ise GEÇTİ seviyesi veriniz
        puanı 2,0-2,5 arasında ise İYİ seviyesi veriniz
        puanı 2,5-3,5 arasında ise ÜST seviyesi veriniz
        puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

Switch case kullanarak  KALDI Seviyesine F harf notu veriniz.
                        GEÇTİ Seviyesine D harf notu veriniz.
                        IYI Seviyesine C harf notu veriniz.
                        UST Seviyesine B harf notu veriniz.
                        HARIKA Seviyesine A harf notu veriniz.
 */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 0-4 arasıonda notlarınız giriniz.. ");
        double not = input.nextDouble();
        String seviye = "";


        if (not >= 0 && not < 1) {
            seviye = "KALDI";
        } else if (not >= 1 && not < 2) {
            seviye = "GEÇTİ";
        } else if (not >= 2 && not < 2.5) {
            seviye = "İYİ";
        } else if (not >= 2.5 && not < 3.5) {
            seviye = "ÜST";
        } else if (not >= 3.5 && not <= 4.0) {
            seviye = "HARİKA";
        } else {
            seviye = "Atanmadı";
        }
        System.out.println("seviye = " + seviye);

        switch (seviye) {
            case "KALDI":
                System.out.println("F");
                break;
            case "GEÇTİ":
                System.out.println("D");
                break;
            case "İYİ":
                System.out.println("C");
                break;
            case "ÜST":
                System.out.println("B");
                break;
            case "HARİKA":
                System.out.println("A");
                break;
            default:
                System.out.println("lÜTFEN GEÇERLİ BİR NOT GİRİNİZ");
        }


    }


}
