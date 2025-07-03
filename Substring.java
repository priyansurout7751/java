import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();
        String array[]=new String [size];       
        int result=0;
        for(int i=0;i<size;i++){
        array[i]=sc.nextLine();
        result=result+array[i].length();

        }
        System.out.println(result);
    }
    
}
