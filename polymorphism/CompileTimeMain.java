package polymorphism;

public class CompileTimeMain {
    public static void main(String[] args) {
        CompileTime compileTime= new CompileTime();
        compileTime.display();
        compileTime.display(100.33,200);
        compileTime.display('1',200);
//        compileTime.display(100,200);
    }
}
