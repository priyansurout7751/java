
import java.util.*;
public class S {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter 1styour name");
        String name=sc.nextLine();
        System.out.println("enter your 2nd munber ");
        String name1=sc.next();
        System.out.println("the joining of two element is ");
        String name2=name+ "**"+name1;
        System.out.println("print the joining element ");
        //find ourt the length of the given string
        //to use .length ();
        //char at function to print the array in the given array
        for(int i=0;i<name2.length();i++){
            System.out.println(name2.charAt(i));
        }

    
    }
    
}
 
