public class Fibonacchi {
    public static int a(int n) {
        // base case
        if (n == 0 || n == 1) {
            return n;
        } else {
            int prev = a(n - 1); 
            int prevprev = a(n - 2);
            // self work
            int b = prev + prevprev;
            return b;
        }
        
        
    } 

    public static void main(String[] args){
        //print the fibonachi series  from  nth numnber
        for(int i=0;i<10;i++)
        System.out.println(a(i));
    }

}
