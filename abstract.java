abstract   class A{
    abstract  void m1();
}
  class cat extends A{
abstract  public void m2(){
        System.out.println("abstract class can not have its own object ");
}
         public static void main(String[] args) {
       cat c=new cat();
        c.m1();
     }
      }  




