import java.util.Scanner;

public class Pattern2 {
   public static void main(String[] args) {
    Scanner re=new Scanner(System.in);
    System.out.println("enter the any number");
    int n=re.nextInt();
    for(int i=1;i<=n;i++){
        //print enter the space
        int space=n-i;
        for(int j=1;j<=space;j++){
            System.out.print(" ");
        }
        //print the star
        for(int j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();

    }
   } 
}
