package January2026;

    public class January2026 {
        // 1. The array must be static
        private static int[] arr = {1, 2, 3, 4, 5};

        // 2. The method must be static
        public static void printArray() {
            for (int number : arr) {
                System.out.println(number);
            }
        }

        public static void main(String[] args) {
            // Now you can call it directly without "new MyClass()"
            printArray();
        }
    }
