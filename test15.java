public class test15 {
    public static void main(String[] args) {
        int j = 0;
        int i = 0;
        String a = "";
        for (i = 6; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            a += -(i - 7);
            System.out.println(a);
        }

    }

}
