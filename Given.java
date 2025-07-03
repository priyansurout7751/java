public class Given {
    public static  void printmultipule(int n,int m){
        if(m==1){
           System.out.println(n);
    }
        printmultipule(n,m-1);
        System.out.println(n*m);
    }
    public static void main(String[] args) {
        printmultipule(5,4);
    }
    
}
