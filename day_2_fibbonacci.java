package week_1;

public class day_2_fibbonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int n=10;
		System.out.println(n+" Fibonacci Sequences: ");
		System.out.print("0 1 ");
		for(int i=1;i<=n-2;i++){
			int sum = a+b; 
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}

	}

}
