public class test9 {
    public static void main(String[] args) {
        String grade = "";
        while (grade.length() <= 5) {
            System.out.printf("%s\n", grade);
            grade += "*";
        }
    }
}