// interface  A{
//     int c=10;
// }
// abstract  class ooo implements A{
//     // public void m1(){
//     //     System.out.println("hello world");

//     // }
//     // public void m2(){
//     //     System.out.println("hello hay");
//     // }
//     // public static void main(String[] args) {
//     //     ooo b=new ooo();
//     //     b.m1();
//     //     b.m2();
//     //     System.out.println(A.c);
//     // }
// }
// class priya{
//      public void m1(){
//         System.out.println("hello world");

//     }
//     public void m2(){
//         System.out.println("hello hay");
//     }
//     public static void main(String[] args) {
//         priya c=new priya();
//         c.m1();
//         c.m2();
//         System.out.println(A.c);
//     }
// }
interface  A{
     static  int  m1(){
        System.out.println("thid is writing default modifier in java");
        return 20;

    }
}
    interface B{
         void m3(){
            System.out.println("how to acces the thid method inside an interface using non static method  ");
        }
    }
    

public class ooo implements A  {
    
    public static void main(String[] args) {
        ooo g=new ooo();
        
      System.out.println(A.m1());       
       // System.out.println(A.c);

        
    }

}







