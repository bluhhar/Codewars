public class Main {
    public static String smash(String... words) {
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(smash(new String[] { "hello", "world", "this", "is", "great" }));
        System.out.println(smash(new String[] { "Bilal", "Djaghout" }));
        System.out.println(smash(new String[] {}));
        System.out.println(smash(new String[] { "Bilal" }));
    }
}