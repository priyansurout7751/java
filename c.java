
//     public void m1(float x){
//         System.out.println("hello world"+ x);
//     }
//      public void M1(float  t){
//         System.out.println("this is a another method");
//     }

// // class y extends c{
// //     public void m1(float  t){
// //         System.out.println("this is a another method");
// //     }
//     public static void main(String[] args) {
//         c a=new c();
//         a.m1(123);
//     }
// }
class A{

}
class  b extends A{

}
class c{
    public A m1(){
    System.out.println("this is not an parent class of any classed");
    return new A();
    }
}
class d{
    public b m1(){
        System.out.println("this keyword");
        return new b();

    }
    public static void main(String[] args) {
        c a=new c();
        System.out.println(a.m1());
        
    }

}

