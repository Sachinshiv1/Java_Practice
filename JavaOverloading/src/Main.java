
// Constructor OverLoading
class A{
    int a,b,c;
    A(int x,int y){
        a = x;
        b = y;
        System.out.println("Sum of: "+a+" + "+b+" = "+(a+b));
    }
    A(int x,int y,int z){
        a = x;
        b = y;
        c = z;
        System.out.println("Sum of: "+a+" + "+b+" + "+c+" = "+(a+b));
    }
}

class Main {
    public static void main(String[] args) {
        A a = new A(10,20);
        A b = new A(2,4,8);
    }
}