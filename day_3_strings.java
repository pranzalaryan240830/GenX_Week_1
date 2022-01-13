package week_1;

import java.util.Scanner;

public class day_3_strings {

	/**
	 * @param args
	 */
	public static boolean isPalindrome(String s1){
			int l = s1.length();
			for(int i=0;i<l;i++){
				if(s1.charAt(i)!=s1.charAt(l-i-1)){
					return false;
				}
			}
			return true;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string S1: ");
		String s1 = s.nextLine();
		if(isPalindrome(s1)){
			System.out.println("String is Palindrome!");
		}
		else{
			System.out.println("Strind is not Palindrome!");
		}
		
		
		
	}

}
