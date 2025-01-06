package test;

public interface ITest {
	public static class SubClass1{ //by default it taken as static
		public void m1(int x) {
			System.out.println("==InnerClass Interface Body==");
			System.out.println("Value of x :"+x);
		}
	}
}


