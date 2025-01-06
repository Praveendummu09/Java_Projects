package maccess;
import test.*;
public class DemoInnerInterface {
	public static void main(String args[])
	{
		System.out.println("===InnerInterface in Class===");
		SubClass.ITest1 ob=(int x)->
		{
			System.out.println("The value of a "+x);
		};
		ob.m1(6);
		SubClass.ITest11 ob1=() ->
		{
			System.out.println("===Static Interface in SubClass===");
		};
		ob1.m11();
		ITest.ITest11 ob2=()->{
			System.out.println("=== InnerInterface in an Interface===");
		};
		ob2.m1();
		AClass.ITest2 ob3=(int x)->
		{
			System.out.println("The value of a "+x);
		};
		ob3.m2(45);
		AClass.ITest22 ob4=()->
		{
			System.out.println("=== InnerInterface in an Abstract Class===");
		};
		ob4.m22();
		
	}
}
