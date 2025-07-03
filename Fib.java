import java.util.Scanner;

public class Fib {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //fibonachhi  series means i.e 0 1 1 2 3 5 8 13 21 this type is fibonachhi series
        System.out.println("enter the term ");
        int term=sc.nextInt();
        int a=0;
        int b=1;
        int c;
        for(int i=1;i<=term;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
