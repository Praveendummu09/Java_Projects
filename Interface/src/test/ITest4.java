package test;

public interface ITest4 {
	public abstract void m1(int x);
	public static void m2(int y) {
		System.out.println("====ITest4 static m2()====");
		System.out.println("The value of y :"+y);
	}
	default void m33(int z) {
		System.out.println("====ITEst4 defalt m3()====");
		System.out.println("The value of z :"+z);
	}

}
