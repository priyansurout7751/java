import java.util.Scanner;

public class Atm {
static void balance(){
    int n=10000;
    System.out.println(n);
}
static void withdral(int n){
    int amount;
    System.out.println("enter your amoutnt ");
    Scanner sc=new Scanner(System.in);
    amount=sc.nextInt();
    if(amount>0 || amount<=n){
       n-=amount;
        System.out.println("withdral your succesfully remainng balance:"+ n);
    } 
    else{
        System.out.println("there have no in sufficient balance in your account");
    }

}
static void deposite(int n){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your element");
    
    int amount=sc.nextInt();
    if(amount>0){
       
        n=n+amount;
        System.out.println("deposite in your :"+ n);
    }
    else{
        System.out.println("invalid deposite please try again");
    }

}


    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=10000;int choice;
   System.out.println(" press 1 for check the balance");
   System.out.println("press 2 for withdral ");
   System.out.println("press3 fordeposite ");
   System.out.println("press  for exit");
   
   System.out.println("enter your choice what is your need");
choice=sc.nextInt();
switch(choice){
    case 1: balance();
    break;
    
    case 2: withdral(10000);
    break;
    case 3:deposite(10000);
    break;
    default:
    System.out.println("pleace enter your valid choice");

}
    }
}
