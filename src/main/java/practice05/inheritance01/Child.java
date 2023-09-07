package practice05.inheritance01;

public class Child extends Parent{

    int yas =10;

    public static void main(String[] args) {

        method1(); // static method child class daki static main method dan direk çağrılabilir
        method2();
        System.out.println("isim = " + isim);
        System.out.println("soyisim = " + soyisim);
        isim="Veli";
        System.out.println("isim = " + isim);

        Parent obj1 = new Parent();
        obj1.method3();
        obj1.method4();
        System.out.println("obj1.yas = " + obj1.yas);
        Child obj2 = new Child();
        obj2.method3();
        obj2.method4();
        System.out.println("obj2.yas = " + obj2.yas);


    }



}
