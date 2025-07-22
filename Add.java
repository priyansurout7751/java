public class Add {
    public void add(int x,int y){
        System.out.println(x+y);
    }
    public void add(int x,int y,int z){
        System.out.println(x+y+z);
    }
    public static void main(String[] args) {
        Add d=new Add();
        d.add(1,2);
        d.add(1,2,3);
        
    }

}
