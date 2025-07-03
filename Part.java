import java.util.Scanner;

public class Part {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //spcce
            int space=n-i;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //enter the star
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
