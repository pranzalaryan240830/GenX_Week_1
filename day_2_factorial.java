package week_1;

import java.util.Scanner;

public class day_2_factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = s.nextInt();
		if(n==1 || n==0){
			System.out.println("Factorial is: 1");
		}
		else{
			int fact=1;
			for(int i=2;i<=n;i++){
				fact*=i;
			}
			System.out.println("Factorial of "+n+" is: "+ fact);		
		}
		
	}

}
