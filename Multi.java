
    
import java.util.Scanner;

public class  Multi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    int[][]a=new int[3][3];
     int[][]b=new int[3][2];
    int[][]c=new int[3][2];
    int sum;
    
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            a[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter the second array");
    for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
            b[i][j]=sc.nextInt();
        }
    }
    System.out.println("the multi plication array");
    for(int i=0;i<3;i++){
        for(int j=0;j<2;j++){
        sum=0;
        for(int k=0;k<3;k++){
            sum=sum+a[i][k]*b[k][j];
            c[i][j]=sum;
           

        }
         System.out.print(" "+c[i][j]);
        }
    System.out.println();

}  

    }

}

