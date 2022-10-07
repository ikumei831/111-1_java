import java.util.Scanner;
public class test5{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
        System.out.println("grade:");
		int num1= input.nextInt();
        
        if(num1>=60 & num1<=100){
            if(num1>=90)System.out.println("A");
            else if(num1>=80)System.out.println("B");
            else if(num1>=70)System.out.println("C");
            else System.out.println("D");
        }
        else{
            System.out.println("E");
        }
	}    
	public static void printStr(int str){
		System.out.println("ep " + sum);
	}
}