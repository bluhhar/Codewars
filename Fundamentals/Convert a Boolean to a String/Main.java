public class Main {
    public static String convert(boolean b) {
        return b ? "true" : "false";
    }

    public static void main(String[] args) {
        System.out.println(convert(true));
        System.out.println(convert(false));
    }
}