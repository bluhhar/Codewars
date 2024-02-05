public class Main {
    public static int summation(int n) {
        int i = 1;
        int sum = 0;
        while(i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(summation(1));
        System.out.println(summation(2));
        System.out.println(summation(5));
        System.out.println(summation(8));
    }
}