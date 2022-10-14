public class test9_1 {
    public static void main(String[] args) {
        
        String space = "";
        while (space.length() < 5) {
            System.out.printf("%s\n", space);
            space += "*";
        }
        StringBuffer space2= new StringBuffer(space);  
        while (space2.length() > 0) {
            System.out.printf("%s\n", space2);
            //space2.deleteCharAt(space2.length()-1);  
            space2.delete(space2.length()-1, space2.length()); 
        }

    }
}        
