
//     }
// }
// package bdk;
// import Bbsr.modifier
// public class mod{
//     public void m2(){
//         System.out.println("this is an another method");
//     }
//     public static void main(String[] args) {
//         modifier a=new a();
//         a.m1();
//     }
// }
// class a{
//     final  int t=10;
//     public static void main(String[] args) {
//         a b=new a();
//        b. t=40;
//         Console.log(t);
//     }
// }
/*class test {

    public void m1( Object s) {
        System.out.println("hii");
    }

}
class x extends test{
    public void m1(x c){
        System.out.println("hii 2");
    }
}
class y extends  x{
    public void m1(y b){
        System.out.println("hii 3");
    }
    public static void main(String[] args) {
        y g=new y();
        g.m1(null);
    }

}*/
// class t{
//     public t m1(int c){
//         System.out.println("enter the number");
//         return null;
//     }
// }
//     class b extends t{
//     public b  m1(int c){
//         System.out.println("this is an another method");
//         return null;
//     }
//     public static void main(String[] args) {
//         t a=new t();
//         System.out.println(a.m1(5));
//     }
//     }
//     class j{
//     }
// class u{
//     final  int x=20;
//     public final void m1(){
//         System.out.println("heoo");
//         System.out.println(x);
//     }
// }
// class i extends u{
//     public void m1(){
//         System.out.println("hello world");
//     }
//     public static void main(String[] args) {
//         i a=new i();
//         System.out.println(a.m1);
//     }
// }
abstract  class a {

    public final void m1() {
        System.out.println("this is uesd in final keyword  in java but method also a declare also final keyword ");

    }
}
    class test extends a{

    

    public static void main(String[] args) {
        test t = new test();
        t.m1();
    }
}

