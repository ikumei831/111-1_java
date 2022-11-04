public class test11 {
    public static void main(String[] args) {

        int flag = 0;
        int row = 0;
        String space = "*";

        while (row < 9) {
            flag = 5;
            while (flag - 1 > row) {
                System.out.print(" ");
                flag--;
            }
            while (flag - 1 < row) {
                System.out.print(" ");
                flag++;
            }
            row++;
            if (row > 4) {
                StringBuffer space2 = new StringBuffer(space);
                space2.delete(space2.length() - (row - 5) * 2, space2.length());
                System.out.println(space2);

            } else {
                System.out.println(space);
                space += "**";
            }
        }

    }
}