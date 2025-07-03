import java.util.Scanner;

public class Petten {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the any number");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //print the space 
        int space=2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //print the second part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    //print the lower part 
      for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        //print the space 
        int space=2*(n-i);
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //print the second part
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
    }
}
