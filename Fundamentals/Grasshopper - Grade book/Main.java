public class Main {
    public static char getGrade(int s1, int s2, int s3) {
        double score = (double)(s1 + s2 + s3) / 3;
        if(90 <= score) {
            return 'A';
        }
        else if(80 <= score) {
            return 'B';
        }
        else if(70 <= score) {
            return 'C';
        }
        else if(60 <= score) {
            return 'D';
        }
        return 'F';
    }

    public static void main(String[] args) {
        System.out.println("---A---");
        System.out.println(getGrade(95,90,93));
        System.out.println(getGrade(100,85,96));
        System.out.println(getGrade(92,93,94));
        System.out.println(getGrade(100,100,100));
        System.out.println("---B---");
        System.out.println(getGrade(70,70,100));
        System.out.println(getGrade(82,85,87));
        System.out.println(getGrade(84,79,85));
        System.out.println("---C---");
        System.out.println(getGrade(70,70,70));
        System.out.println(getGrade(75,70,79));
        System.out.println(getGrade(60,82,76));
        System.out.println("---D---");
        System.out.println(getGrade(65,70,59));
        System.out.println(getGrade(66,62,68));
        System.out.println(getGrade(58,62,70));
        System.out.println("---F---");
        System.out.println(getGrade(44,55,52));
        System.out.println(getGrade(48,55,52));
        System.out.println(getGrade(58,59,60));
        System.out.println(getGrade(0,0,0));
    }
}