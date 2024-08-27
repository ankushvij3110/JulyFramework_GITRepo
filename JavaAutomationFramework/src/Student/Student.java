package Student;

public class Student {
	
	int rollNo;
	int age;
	
	public void display1() {
		
		System.out.println("Welcome to All of You");
		
	}
public void display2() {
		
		System.out.println("Automation is very easy to perform");
		
	}
public int displayAge(int x) {
	
	System.out.println("Automation is very easy to perform");
	System.out.println("This is your age: "+x);
	return x;
	
}
	
	public static void main(String[] args) {
		
		
		Student ankush=new Student();
		
		ankush.age=33;
		ankush.rollNo=1800;
		ankush.display1();
		ankush.display2();
		System.out.println(ankush.age);
		System.out.println(ankush.rollNo);
		ankush.displayAge(43);
		
		
	}

}
