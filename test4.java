import java.util.Scanner;
public class test4{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
        System.out.println("Insert first number:");
		int num1= input.nextInt();
        if(num1>=60 & num1<=100){
            if(num1>=90)System.out.println("非常好");
            else if(num1>=80)System.out.println("好");
            else if(num1>=70)System.out.println("普通");
        }
        else{
            System.out.println("不及格");
        }
	}    
	public static void printStr(int str){
		System.out.println("My name is " + sum);
	}
}