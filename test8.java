public class test8 {
    public static void main(String[] args) {
        String grade = "";
        while (grade.length() < 10) {
            System.out.printf("%s%d\n", grade, grade.length());
            grade += " ";
        }
    }
}