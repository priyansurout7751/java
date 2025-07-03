public class Findpow {
    //find the power of the given number
    public static int pow(int n,int k){
    if(k==0){
        return 1;
    }
    int small=pow(n,k/2);
    if(k%2==0){
        return small*small;

    }
    else{
        //the power is odd then println 
        return n*small*small;
    }

    }
    public static void main(String[] args) {
       int a= pow(5,3);
       System.out.println(a);
    }
    
}
