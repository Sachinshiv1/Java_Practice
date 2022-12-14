import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IdnMatrix();
        Matrix();
        System.out.println("Enter No of Elements you want to Enter ");
        int num = sc.nextInt();

        int[] arr = new int[num];
        System.out.println("Enter Your Elements ");
        for (int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("\tYour Array is : ");
        ShowArray(arr);


        System.out.println("\n\nEnter Element you want to Find : ");
        int key = sc.nextInt();
        Search(key,arr);


        Sort(arr);
        System.out.print("\nYour Sorted Array is : ");
        ShowArray(arr);

    }

    public static void Sort(int array1[]){
        int len = array1.length;
        for (int i=0; i<len; i++){
            for (int j=i+1;j<len; j++){
                if(array1[i]>array1[j]){
                    int temp = array1[i];
                    array1[i] = array1[j];
                    array1[j] = temp;
                }
            }
        }
    }

    public static void Search( int key,int[] arr){
        int num = arr.length;
        int flag = 1;
        for (int i=0;i<num;i++){
            if(key == arr[i]) {
                System.out.println("Element Found at Position " + (i + 1));
                flag = 0;
                break;
            }
        }
        if(flag>0)
            System.out.println("Element not Found!");
    }

    public static void ShowArray(int[] array1){
        int num = array1.length;
        for (int i=0;i<num;i++){
            System.out.print(array1[i]+" ");
        }
    }

    public static void AddMatrix(int[][] mat1,int[][] mat2,int l, int m){

        int[][] res = new int[l][m];
        for (int i=0;i<l;i++){
            for (int j=0;j<m;j++){
                res[i][j] = (mat1[i][j]+mat2[i][j]);
            }
        }
        System.out.println("\nThe Addition Matrix is : \n");
        for (int i=0;i<l;i++){
            for (int j=0;j<m;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void Matrix(){
        Scanner sc = new Scanner(System.in);
        int l,m;
        System.out.println("Enter Row Number of Matrix : ");
        l = sc.nextInt();
        System.out.println("Enter Colum Number of Matrix : ");
        m = sc.nextInt();
        int[][] mat1 = new int[l][m];
        int[][] mat2 = new int[l][m];

        System.out.println("\nEnter Matrix1 :");
        for (int i=0;i<l;i++){
            for (int j=0;j<m;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("\nEnter Matrix2 :");
        for (int i=0;i<l;i++){
            for (int j=0;j<m;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        AddMatrix(mat1,mat2,l,m);
    }
    public static void IdnMatrix(){
        Scanner sc = new Scanner(System.in);
        int l,m;
        System.out.println("Enter Row Number of Matrix : ");
        l = sc.nextInt();
        System.out.println("Enter Colum Number of Matrix : ");
        m = sc.nextInt();
        int[][] mat1 = new int[l][m];

        System.out.println("\nEnter Matrix :");
        for (int i=0;i<l;i++){
            for (int j=0;j<m;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        int count = 0;
        int res = 0;
        for (int i=0;i<l;i++) {
            for (int j = 0; j < m; j++) {
                res = res + mat1[i][j];
                if (mat1[i][i] == 1){
                    count+=1;
                }
            }
        }
        if (res == m)
            System.out.println("\nThe Matrix is Identity Matrix : \n");
        else
            System.out.println("\nThe Matrix is Not Identity Matrix : \n");
    }
}
