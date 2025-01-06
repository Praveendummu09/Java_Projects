package test;

public interface ITest {
	public abstract void m1(int x);
	public static void m2(int y) {
		System.out.println("====static m2()====");
		System.out.println("The value of y :"+y);
	}
	default void m3(int z) {
		System.out.println("====static m3()====");
		System.out.println("The value of z :"+z);
	}

}
