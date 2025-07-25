abstract   class A{

 public void m2(){
        System.out.println("abstract class can not have its own object ");
     }



}
class b extends A {
     


   
    public static void main(String[] args) {
       b c=new b();
        c.m2();
        
    }
}

