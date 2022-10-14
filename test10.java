public class test10 {
    public static void main(String[] args) {
        
        int flag=0;
        int row=0;
        String space="*";
        while (row<5) {
            flag=5;           
            while (flag-1>row) {
                System.out.print(" ");
                flag--;
            }       
            System.out.println(space); 
            row++;      
            space+="**";
        }
    }
}        