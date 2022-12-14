
// Constructor OverLoading
class A{
    int a,b,c;
    A(int x,int y){
        a = x;
        b = y;
    }
    A(int x,int y,int z){
        a = x;
        b = y;
        c = z;
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A(10,20);
        System.out.println("Sum of: "+a.a+" + "+a.b+" = "+(a.a+a.b));
        A b = new A(2,4,8);
        System.out.println("Sum of: "+b.a+" + "+b.b+" + "+b.c+" = "+(b.a+b.b+b.c));
    }
}