package test;

public class Model3IC implements Model3{

	@Override
	public void m1(int x) {
		 System.out.println("****m1(x)****");
		 System.out.println("The value x:"+x);
	}

	@Override
	public void m2(int x) {
		 System.out.println("****m2(x)****");
		 System.out.println("The value x:"+x);
	}

	@Override
	public void dis(int x) {
		 System.out.println("****dis(x)****");
		 System.out.println("The value x:"+x);
		
	}

	@Override
	public void m3(int z) {
		 System.out.println("****m3(z)****");
		 System.out.println("The value x:"+z);
		
	}

}
