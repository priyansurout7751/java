import java.util.Scanner;

public class Amstrong {
    public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the any number ");
    int n=sc.nextInt();
    int r;
    int cube;
    int sum=0;
    int temp=n;
    while(n>0){
         r=n%10;
         cube=r*r*r;
         sum=sum+cube;
         n=n/10;
    }
   if(temp==sum){
    System.out.println("the number is a amstrong number");
   }
   else{
    System.out.println("the number is not a amstrong number");
   }
    }
}
