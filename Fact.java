class fact{
    public static int fib(int n)
    {
        if(n==0 || n==1){
            return 1;
        }
        int smaller=fib(n-1);
        int ans=n*smaller;
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}