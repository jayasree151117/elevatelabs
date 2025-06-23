package elevatelabs;

import java.util.Scanner;

public class ConsoleCalculator {
	public static void main(String[] args) {
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		num1=sc.nextDouble();
		num2=sc.nextDouble();
		System.out.println("enter the operators(+,-,*,/):");
		char ch=sc.next().charAt(0);
		double db=0;
		switch(ch) {
		case '+' :db=num1+num2;
		          System.out.println("the addion of num1 and num2 is =" +db);
		          break;
		case '-' :db=num1+num2;
		          System.out.println("the subtraction  of num1 and num2 is =" +db);
                  break;
		case '*' :db=num1+num2;
		          System.out.println("the multiplication of num1 and num2 is =" +db);
                  break;
		case '/' :db=num1+num2;
		          System.out.println("the division of num1 and num2 is =" +db);
                  break;
        default:System.out.println("you entered wrong input");
		          
		}
	}

}
