interface  A{
    int c=10;
}
abstract  class ooo implements A{
    // public void m1(){
    //     System.out.println("hello world");

    // }
    // public void m2(){
    //     System.out.println("hello hay");
    // }
    // public static void main(String[] args) {
    //     ooo b=new ooo();
    //     b.m1();
    //     b.m2();
    //     System.out.println(A.c);
    // }
}
class priya{
     public void m1(){
        System.out.println("hello world");

    }
    public void m2(){
        System.out.println("hello hay");
    }
    public static void main(String[] args) {
        priya c=new priya();
        c.m1();
        c.m2();
        System.out.println(A.c);
    }
}





