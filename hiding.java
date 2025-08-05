public class hiding {
    public static void main(hiding t){
        System.out.println("this is of parent class of method hiding ");
    }
    public static void main(String[] args) {
        hiding.main(null);
    

        
    }
    
}
class test extends hiding{
    public static void main(hiding t){
        System.out.println("this is my  hello child class method hiding ");
    }

}
