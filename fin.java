public class fin {
    final  int x=123;
    public final void m1(){
        System.out.println("this is an final named method");
    }

    public static void main(String[] args){
        fin a=new fin();
        //a.x=3;
        System.out.println(a.x); 
    }
    
}
class y extends  fin{
    public final void m1(){
        System.out.println("this is an another final method ");
    }
    public static void main(String[] args) {
        y a=new y();
        a.m1();
    }
}
