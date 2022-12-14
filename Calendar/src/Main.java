import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        //System.out.println("Enter No of Day ");
        //int day = Sc.nextInt();

        System.out.println("Enter the Year ");
        int year = Sc.nextInt();
        year--;
        int flag = 0;
        if(year%4==0 && year%100!=0){
            System.out.println("Its Leap year");
        }
        else{
            if(year%400==0)
                System.out.println("Its a Leap Year ");
            else
                System.out.println("Its not a Leap Year");
                flag = 1;
        }

    }

}