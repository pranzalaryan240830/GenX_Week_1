package week_1;

import java.util.ArrayList;
import java.util.Scanner;

public class day_3_arrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many dishes do you like approx: ");
		int n = s.nextInt();
		s.nextLine();
		ArrayList<String> dish = new ArrayList<String>();
		String d;
		for(int i=1;i<=n;i++){
			System.out.println("Enter Name of Dish "+i+" :");
			d = s.nextLine();
			dish.add(d);
			s.nextLine();
			d="";
		}
		System.out.println(dish);
		if(!dish.isEmpty()){
			System.out.println("After removing one dish");
			dish.remove(1);
			System.out.println(dish);
		}
	}

}
