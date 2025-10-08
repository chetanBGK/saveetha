public class Inheritance {
    public static void main(String[] args) {
        class3 obj = new class3();
        obj.display();

    }
}

class class1{
    public void display(){
        System.out.println("Class 1 method called");
    }
}

class class2 {

    public void display(){
//        super.display();
        System.out.println("Class 2 method called");
    }
}

class class3 extends class2{
    public void display(){
        super.display();
        System.out.println("Class 3 method called");
    }
}
