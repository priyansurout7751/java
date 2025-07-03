import java.util.Scanner;

class Arr{
    public static int  a(int[]age,int target){
        int n=age.length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(age[i]+age[j]==target){
                       ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any number");
        int n=sc.nextInt();
        int []age=new int [n];
        int target;
        System.out.println("enter the any target");
        target=sc.nextInt();
        System.out.println("enter the array");
        for(int i=0;i<n;i++){
            age[i]=sc.nextInt();

        }
        System.out.println(a(age,target));

    }

}
   



