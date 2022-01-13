package week_1;

import java.util.Scanner;

public class day_3_switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("1. Add \t 2. Subtract \t 3. Multiply \t 4. Divide");
		System.out.println("Enter operation:");
		n=s.nextInt();
		System.out.println("Enter num 1:");
		int a = s.nextInt();
		System.out.println("Enter num 2:");
		int b = s.nextInt();
		System.out.println("Result: ");
		switch(n){
		case 1:
			System.out.print(a+b);
			break;
		case 2:
			System.out.print(a-b);
			break;
		case 3:
			System.out.print(a*b);
			break;
		case 4:
			System.out.print(a/b);
			break;
		default:
			System.out.println("Thank You");
			break;
		}

	}

}
