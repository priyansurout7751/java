public class Part2 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            //enter the space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //enter the star
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //print the second star
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
