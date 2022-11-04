public class test13 {
    static int flag = 2;

    public static void main(String[] args) {

        for (int i = 0; i <= flag; i++) {
            a(i);
        }
        for (int i = flag - 1; i > 0; i--) {
            a(i);
        }

    }

    public static void a(int i) {
        for (int j = flag - i; j >= 0; j--) {
            System.out.print(" ");
        }
        for (int j = 1; j < i * 2; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
