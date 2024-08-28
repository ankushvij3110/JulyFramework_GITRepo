package Student;

public class ConstructorExample {
	
	public ConstructorExample() {
		System.out.println("This is a Default Constructor");
	}
	public ConstructorExample(int a) {
		System.out.println("This is a Parametrized Constructor");
	}
	
	public static void main(String[] args) {
		
		ConstructorExample constructorObject=new ConstructorExample();
		
		
	}

}
