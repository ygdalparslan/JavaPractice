package practice05.inheritance01.inheritance02;

public class Corsa extends  Opel{

    String hiz ="Corsa arabalar max 200 km hız yapar";
    String yakit ="Corsa arabalar benzinli veya elektriklidir";
    String model ="Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar çevreci motor kullanır");
    }

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5,6 lt yakıt tüketir");
    }

    protected  void vitesSayisi(){
        System.out.println("Corsa arabalar 5 viteslidir");
    }

    public static void main(String[] args) {

        //Corsa class ında corsa objesi oluşturalım

        Corsa arb1 = new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa
        System.out.println("arb1.yakit = " + arb1.yakit);//Corsa
        System.out.println("arb1.marka = " + arb1.marka);//Opel
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//Opel
        System.out.println("arb1.model = " + arb1.model);//Corsa
        arb1.motor();//Corsa


        Opel arb2 = new Corsa();
        System.out.println("arb2.hareket = " + arb2.hareket);//araba
        System.out.println("arb2.hiz = " + arb2.hiz);//Opel
        System.out.println("arb2.yakit = " + arb2.yakit);//araba
        System.out.println("arb2.marka = " + arb2.marka);//Opel
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);//Opel

        arb2.motor();
        /*inheritance da veriabler aramaya data türünden başlanır
        ve bulamazsa parent a bakar ilk bulduğunu getirir.

        Anacak inheritance da metotdlar aramaya data türünden başlanır
        bulamazsa parent a bakar ilk bulduğu yerden alma constructor ın olduğu yere kadar override edilmiş mi diye bakar son bulduğunu getirir
        */

        arb2.garanti();//opel
        arb2.yakitTuketimi();//Corsa

        Araba arb3 = new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);//araba
        System.out.println("arb3.hiz = " + arb3.hiz);//araba
        System.out.println("arb3.yakit = " + arb3.yakit);//araba
        //arb3.model  CTE verir
        arb3.motor();//corsa
        arb3.yakitTuketimi();//corsa


        Araba arb4 = new Opel();
        System.out.println("arb4.hiz = " + arb4.hiz);//araba
        System.out.println("arb4.yakit = " + arb4.yakit);//araba
        arb4.motor();//opel
        arb4.yakitTuketimi();//araba


    }




}
