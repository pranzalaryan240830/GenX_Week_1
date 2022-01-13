package week_1;

public class day_3_type_conversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 100;
		System.out.println("Integer value: "+x);
		float f = x;
		System.out.println("Corresponding float value: "+ f);
		double d = x;
		System.out.println("Corresponding double value: "+ d);
		
		double dd = 143.3832;
		System.out.println("Now the Double value: "+ dd);
		float ff = (float) dd;
		System.out.println("Corresponding float value: "+ ff);
		int xx = (int) dd;
		System.out.println("Corresponding integer value: "+ xx);
		
		float r = 23.4f;
		float pi = 3.14f;
		int area = (int) (pi*r*r);
		System.out.println("After evaluation of Expression with Decimal values and then converting to Integer the Area is = " + area);
	}

}
