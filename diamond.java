 class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; // height of the upper half (change this as needed)

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
