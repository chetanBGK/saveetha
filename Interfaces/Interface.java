package Interfaces;

public interface Interface {
    void display1();
    void display2();

    static void staticMethod(){
        System.out.println("This is static method from interface");
    }

    default void defaultMethod(){
        System.out.println("This is default method from interface1");
    }
}
