import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("grade:");
        int grade = input.nextInt();
        if (grade <= 100 || grade >= 0) {
            switch (grade / 10 * 10) {
                case 100:
                case 90:
                    System.out.println("A");
                    break;
                case 80:
                    System.out.println("B");
                    break;
                case 70:
                    System.out.println("C");
                    break;
                case 60:
                    System.out.println("D");
                    break;
                default:
                    System.out.println("E");
                    break;
            }
        } else
            System.out.println("not in value");
    }

}