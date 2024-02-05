public class Main {
    public static int[] map(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(map(new int[] {1, 2, 3}));
        printArray(map(new int[] {4, 1, 1, 1, 4}));
        printArray(map(new int[] {1, 1, 1, 1, 1, 1}));
    }
}