import java.util.Scanner;

class Sum{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enterr the number is x you wanr to ");
        int x=sc.nextInt();
        boolean flag=flase;
        //the bolean is a datatype to use is the show the output is  just show in 1 and 0
        for(int i=2;i<=x/2;++i){
            if(x%i==0){
                flag=true;
                break;
            }
            if(!flag){
                System.out.println("the number is prime number");
            }
            else{
                System.out.println("the number is not aprime number");
            }
        }
    }
}