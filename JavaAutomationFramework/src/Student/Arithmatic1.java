package Student;

public class Arithmatic1 {
	
public int sum(int a,int b) {
		
		int c = a+b;
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


public int divide(int x1,int x2) {
	
	int x3 = x1/x2;
	System.out.println("The division is: " + x3);
	return x3;

	
}

public static void main(String[] args) {
	
	
	Arithmatic1 result= new Arithmatic1();
	
	int divResult=result.divide(10,2);
	int subResult=result.sub(divResult, 2);
	int mulResult=result.mul(subResult, 2);
	int subResult1=result.sub(mulResult, 2);
	int finalResult=result.sum(subResult1,2);
	System.out.println("Final Result is: "+finalResult);
	
	

	
	
	
}

}
