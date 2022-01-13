package week_1;

public class day_2_swapping {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Numbers: "+a+", "+ b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("Swapped Numbers: "+a+", "+ b);

	}

}
