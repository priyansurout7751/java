import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]sum=new int[3][3];
    int[][]a=new int[3][3];
    int[][]b=new int[3][3];
    System.out.println("enter the first array");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter the second array");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            b[i][j]=sc.nextInt();
        }
    }
    System.out.println("print enter the first array");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        System.out.print(a[i][j]);
        }
        System.out.println();
    }
    System.out.println("print eentaer the second array");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(b[i][j]);
        }
        System.out.println();
    }
    System.out.println("finding the sum of  array");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            sum[i][j]=a[i][j]+b[i][j];
            System.out.print(" "+sum[i][j]);
        }
        System.out.println();
    }

        }
    }
    


