public class Main {
    public static double find_average(int[] array) {
        if(array.length == 0) {
            return 0;
        }
        double a = 0;
        int k = array.length;
        for (int j : array) {
            a += j;
        }
        return a / k;
    }

    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1, 1, 1}));
        System.out.println(find_average(new int[]{1, 2, 3}));
    }
}