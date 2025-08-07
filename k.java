interface A{
    public void m1();
    public int  m2();
    public default void m3(){
        System.out.println("plaease enter the name ");
    }
    public static void m4(){
        System.out.println("this is my static block inside my inteface");
    }
}
abstract class b implements A{
    public int m2(){
        System.out.println("hello ");
        return 2;
    }

  
    
    public static void main(String []args){
        b a=new g();
        //System.out.println(a.m2());
        a.m1();
        a.m2();
        a.m3();
        A.m4();
        
    }
}

class g extends b{
    public void m1(){
        System.out.println("this another method inside an interface ");
      
        
    }
}
      