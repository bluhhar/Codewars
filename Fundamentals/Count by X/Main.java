public class Main {
    private static int[] countBy(int x, int n) {
        int[] arr = new int[n];
        arr[0] = x;
        for(int i = 1; i < arr.length; i++) {
            if (arr[i] % x == 0) {
                arr[i] = arr[i - 1] + x;
            }
        }
        return arr;
    }

    private static void printArray(int[] arr){
        for(int j : arr){
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(countBy(1, 10));
        printArray(countBy(2, 5));
    }
}