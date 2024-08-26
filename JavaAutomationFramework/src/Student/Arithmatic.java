package Student;

public class Arithmatic {
	
	public int sum(int a,int b) {
		
		int c = a+b;
		System.out.println("the sum is "+c);
		return c;
		
	}
public int sub(int c,int d) {
		
		int e = c-d;
		System.out.println("the sub is "+e);
		return e;
		
	}

public int mul(int x,int y) {
	
	int z = x*y;
	System.out.println("the mul is "+z);
	return z;
	
}


public void divide(int x1,int x2) {
	
	int x3 = x1/x2;
	System.out.println("The Final Result is: " + x3);

	
}

public static void main(String[] args) {
	
	
	Arithmatic result= new Arithmatic();
	
	int sumResult=result.sum(10,2);
	int mulResult=result.mul(sumResult, 2);
	int subResult=result.sub(mulResult, 2);
	int mulResult1=result.mul(subResult, 2);
	result.divide(mulResult1, 2);
	
	

	
	
	
}

}
