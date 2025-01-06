package test;

public interface ITest1 {
	public abstract void m1(int x);
	private void dis1(int a) {
		System.out.println("===Dis(a)===");
		System.out.println("the value of a:"+a);
	}
	private static void dis2(int b) {
		System.out.println("===Dis(b)===");
		System.out.println("the value of b:"+b);
	}
	public default void commoncode(int a, int b)
	{
		this.dis1(a);
		ITest1.dis2(b);
	}

}
