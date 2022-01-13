package week_1;

import java.util.Scanner;

public class day_3_matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int r = s.nextInt();
		System.out.println("Enter the cols: ");
		int c = s.nextInt();
		if(r!=c){
			System.out.println("Invalid Rows and Columns must be equal.");
		}
		else{
		int[][] num = new int[r][c];
		System.out.println("Enter the Array: ");
		for(int i=0;i<r;i++){
			System.out.println("Enter the Row-"+(i+1)+" :");
			for(int j=0;j<c;j++){
				int x = s.nextInt();
				num[i][j] = x;
			}
		}
		System.out.println("Original Matrix is: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(num[i][j]+" ");
			}
			System.out.print("\n");
		}
		System.out.println("Transpose of Matrix is: ");
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(num[j][i]+" ");
			}
			System.out.print("\n");
		}

		}
	}

}
