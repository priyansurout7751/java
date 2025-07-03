import java.util.Scanner;



public class Rec{
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
       //print the upper loop
       int n=5;
       int temp=0;
       for(int i=5;i>=1;i--){
        for(int j=1;j<=i;j++){
          System.out.print(" *"); 
        }
        int space=n-i+temp;
        temp++;
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //print the second arry
        for(int j=1;j<=i;j++){
            System.out.print(" *");
        }
        System.out.println();
       }
       //print the lower step
    }
} 