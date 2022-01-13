package week_1;

import java.util.Scanner;

public class day_3_arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = s.nextInt();
		int[] num = new int[n];
		System.out.println("Enter the Array: ");
		for(int i=0;i<n;i++){
			int x = s.nextInt();
			num[i] = x;
		}
		
		for(int i=n-1;i>=0;i--){
			System.out.print(num[i]+ " ");
		}

	}

}
