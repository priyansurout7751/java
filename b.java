//  class i {
//     public static void m1(){
//         System.out.println("this is my first parent class");
//     }

// }
// public class b extends  i { 
//     public void m2(){
//         System.out.println("this is my child class");
//     }
//     public static void main(String[] args) {
//        c a=new c();
//         System.out.println(a.m3(null));
//         a.m1();
//         System.out.println("------");
//         new b().m2();
//         new i().m1();
//     //    a.m2();
//     }
//     //this is  a single inheritance
// }
// class c extends i{
//     public  demo m3(String s){
//         System.out.println(s);
//         System.out.println("this is my least child class with the method");
//         return  null;
//     }
// }
// class demo{

// class e {

//     public static void m1(Object a) {
//         System.out.println("this is 3 an actual parameter");

//     }
// }
// class a extends e{

//     public static void m1(e a) {
//         System.out.println("this is an actual parameter");

//     }
// }
// class y extends a{
//     public void m1(test t){
//         System.out.println("this is  is a least child method");
//     }
//     public static void main(String[] args) {
//         y a=new y();
//        a.m1(null);
       
//     }

// }
 class test{
    public void main(int a,int b){
        System.out.println("this is my first parent class");
    }
    

   
 }


 class a extends test {
    public void main(int a,int b){
        System.out.println("this is my child class reference");
    }
    public static void main(String[] args) {
        test k=new test();
        k.main(3,5);
        a b=new a();
        b.main(3,4);
        test t=new a();
        t.main(3,5);
        
        
        

 }
   
        
        
    }
 

