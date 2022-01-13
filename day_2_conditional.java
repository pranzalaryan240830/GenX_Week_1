package week_1;
import java.util.*;

public class day_2_conditional {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = s.nextInt();
		if(marks<=100 && marks>=85){
			System.out.println("Grade A");
		}
		else if(marks<85 && marks>=70){
			System.out.println("Grade B");
		}
		else if(marks<70 && marks>=55){
			System.out.println("Grade C");
		}
		else if(marks<55 && marks>=40){
			System.out.println("Grade D");
		}
		else{
			System.out.println("Failed!");
		}
		
	}

}
