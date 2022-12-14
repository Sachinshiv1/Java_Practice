import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter Number of Day ");
        int a1 = Sc.nextInt();
        switch (a1){
            case 0:
                System.out.println("Its Sunday");
                break;
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thrusday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println("Its Saturday");
                break;
            default:
                System.out.println("\t** Enter Number between 0 - 7 **");
        }
        System.out.println("Numbers from 1 to 10 are ");
        for(int i=1;i<11;i++){
            System.out.print(i+" ");
        }

        int count=20;
        System.out.println("\n\nNumbers from 20 to 1 are ");
        while (count>0){
            System.out.print(count+" ");
            count-=2;
        }

        System.out.println("\nNumbers from 1 to 10 are :");
        do{
            count++;
            System.out.print(count+" ");
        }while (count<11);

        /**
        int n1,n2,res;
        System.out.println("\nEnter Two Numbers ");
        n1=Sc.nextInt();
        n2=Sc.nextInt();
        res=n1+n2;
        System.out.println("Sum of "+n1+" + "+n2+" ="+res);
        if(res>10)
            System.out.println("\nSum is greater than 10 ");
        else
            System.out.println("\nSum is Less than 10 ");
         **/
    }
}

