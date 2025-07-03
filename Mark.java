import java.util.Scanner;

public class Mark {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("entr the marks(0-100)");
    int marks=sc.nextInt();
    if(marks<30){
        System.out.println("fail");
    }
    else if(marks>=30 && marks<70){
        System.out.println("b");
    }
    else if(marks>=70 && marks<90){
        System.out.println("a");
    }
    else{
        System.out.println("a++");
    }

   } 
}
