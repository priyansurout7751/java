public class Pow {
    static int sum(int p, int q) {
        if (q == 0) {
            return 1;
        }
        int smaller = sum(p, q - 1);
        return smaller * p;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,4));
      
    }
}
