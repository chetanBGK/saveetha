package Interfaces;

public class InterfaceMain implements Interface2,Interface{
    public static void main(String[] args) {
        InterfaceMain interfaceMain=new InterfaceMain();
        interfaceMain.defaultMethod();

    }

    @Override
    public void display1() {
        System.out.println("Display 1");
    }

    @Override
    public void display2() {
        System.out.println("Display 2");
    }

    @Override
    public void defaultMethod() {
        System.out.println(Interface2.super.getClass());
        Interface2.super.defaultMethod();
        Interface.super.defaultMethod();
    }


}
