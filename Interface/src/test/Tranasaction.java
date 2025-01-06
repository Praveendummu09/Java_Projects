package test;

public interface Tranasaction {
	public static final Balance b=new Balance();
	public abstract void process(int amount) throws WithDraw ;
}
