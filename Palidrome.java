public class Palidrome {
    public static void main(String args []){
        int r;
        int n=255;
        int sum=0;
        int temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("the number is palidrome");
        }
        else{
            System.out.println("the number is not a palidrome");
        }
    }
}
