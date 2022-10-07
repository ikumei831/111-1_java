import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        int grade = 0;
        int flag = 0;
        while (grade < 10) {
            // Thread.currentThread().sleep(1000);
            flag = 0;
            while (flag < grade) {
                System.out.print(" ");
                flag++;
            }
            System.out.printf("%d\n", grade);
            grade++;
        }

    }

}