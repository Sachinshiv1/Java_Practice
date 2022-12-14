import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i < 50 || i > 59)
                System.out.print(i+" ");
        }
    }
}
/*
class Area{
    int l,b,h,r;
    Scanner sc = new Scanner(System.in);
    void Rectangle(){
        System.out.println("Enter Length of Rectangle ");
        l = sc.nextInt();
        System.out.println("Enter Breadth of Rectangle ");
        b = sc.nextInt();
        int arear = l*b;
        System.out.println("Area of Rectangle "+arear);
    }
    void Triagle(){
        System.out.println("Enter Base of Rectangle ");
        b = sc.nextInt();
        System.out.println("Enter Height of Rectangle ");
        h = sc.nextInt();
        double areat = 0.5*b*h;
        System.out.println("Area of Triangle "+areat);
    }
    void Circle(){
        System.out.println("Enter the Radius of Circle ");
        r = sc.nextInt();
        double areac = 3.14*r*r;
        System.out.println("Area of Circle "+areac);
    }

}
public class Main {
    public static void main(String[] args) {
        Area rec = new Area();
        Scanner sc = new Scanner(System.in);

        System.out.println("\t * * * MENU * * * ");
        System.out.println("  1. Press 1 to Find  Area of Rectangle ");
        System.out.println("  2. Press 2 to Find  Area of Triangle ");
        System.out.println("  3. Press 3 to Find  Area of Circle ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> rec.Rectangle();
            case 2 -> rec.Triagle();
            case 3 -> rec.Circle();

            default -> System.out.println("Please enter between 1 - 3 ");
        }

// pi r l
// 2 pi r h
    }
}

 */