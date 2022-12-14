public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.display1();
        b.display2();
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
