public class Constructors {
    public static void main(String[] args) {
        subClass obj=new subClass("ramesh",10);
        subClass obj2=new subClass(10,"maltesh");
        System.out.println(obj.a);
        System.out.println(obj.name1);
//        subClass obj2=new subClass();
//        System.out.println(obj2.a);
//        System.out.println(obj2.name);
    }
}

class subClass{
    int a,b;
    String name1,name2;

    subClass(String name1,int a ){
        this.a=a;
        this.name1=name1;
    }

    subClass(int b ,String name2){
        this.b=b;
        this.name2=name2;
    }
    subClass(int a){
//        this.a=a;
//        this.name=name;
    }

//    subClass(){}

//    subClass(subClass subObj){
//        this.a=subObj.a;
//        this.name=subObj.name;
//    }
}