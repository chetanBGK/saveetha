package polymorphism;

public class CompileTime {
    int a=10;
    int b=20;

    double c=20.20;

    char charVar='c';

    void display(){
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }

    int display(int a){
        System.out.println("a :"+a);
        System.out.println("b :"+b);
        return a;
    }

    void display(double a,int b){

        System.out.println("double int method");
    }
   void display(int a,int b){
        System.out.println("int int method");
    }
    void display(char a,int b){
        System.out.println("char int method");
    }
}
