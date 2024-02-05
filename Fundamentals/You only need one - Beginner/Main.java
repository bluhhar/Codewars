public class Main {
    public static boolean check(Object[] a, Object x) {
        for(Object i : a) {
            if(i == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check(new Object[] {66, 101}, 66));
        System.out.println(check(new Object[] {'t', 'e', 's', 't'},'e'));
        System.out.println(check(new Object[] {"what", "a", "great", "kata"}, "kat"));
    }
}