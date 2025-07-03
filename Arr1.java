import java.util.Scanner;

public class Arr1 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the any number");
        n=sc.nextInt();
        int[]b=new int[n];
        int x;
       
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        //print the array
        for(int i=0;i<b.length;i++){
        System.out.println(b[i]);
        }
         System.out.print("you want to check x at index ");
        x=sc.nextInt();
        for(int i=0;i<n;i++){
            if(b[i]==x){
                System.out.println("x at found index :"+i);
            }
        }
    }
   } 

