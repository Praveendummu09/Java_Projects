package test;

public abstract class AClass {
	public class SubClass2{
		public void m2(int y)
		{
			System.out.println("==InnerClass AbstractClass m2() Body==");
			System.out.println("Value of x :"+y);
		}
	}
	public static class SubClass22{
		public  void m2(int y)
		{
			System.out.println("==InnerClass AbstractClass m22(static) Body==");
			System.out.println("Value of x :"+y);
		}
	}
}
