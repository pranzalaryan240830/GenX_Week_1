package week_1;

public class B extends A{
	public void display(){
		System.out.println("Inside B.");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.display(); // Override
	}

}



