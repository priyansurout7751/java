public class Selection {
    // code for selection sort
    public static void sort(int[] arr) {
        int n = arr.length;
        // the first for loop is no of iteration (n-1) time
        for (int i = 0; i < n - 1; i++) {
            int minterm = i;
            for (int j = i + 1; i < n; i++) {
                if (arr[j] < arr[minterm]) {
                    minterm = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minterm];
            arr[minterm] = temp;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 1, 4 };
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

}
