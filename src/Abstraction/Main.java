package Abstraction;

public class Main {
    public static void main(String[] args) {
        AbstractClassLaptop obj = new HpLaptop();

        AbstractClassLaptop.regularMethod();
        System.out.println("we all r overridden class implemented by HP..");
        obj.HardWare();
        obj.storage();
        obj.graphicsCrad();
        Child1 child = new Child1();
        child.hello();
    }
}
