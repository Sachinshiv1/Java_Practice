public class Main {
    public static void main(String[] args) {
        B b = new B();
//        b.display1();
//        b.display2();
        
        inter AB = new inter();
        AB.print();
        AB.display();
    }
}
class A{
    void display1(){
        System.out.println("This is A");
    }
}
class B extends A{
    void display2(){
        System.out.println("This is B");
    }
}

interface multiInheritenceB{
    void print();
}
interface multiInheritenceC{
    void display();
}
class inter implements multiInheritenceB,multiInheritenceC{
    public void print(){
        System.out.println("This is interface A print");
    }
    public void display(){
        System.out.println("This is interface B display");
    }
}