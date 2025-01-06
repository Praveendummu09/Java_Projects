package maccess;
import test.*;
public class DemoInnerClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITest.SubClass1 ob=new ITest.SubClass1();
		ob.m1(56);
		AClass ob1=new AClass()
				{
			//empty body
				};
		AClass.SubClass2 ob11=ob1.new SubClass2();
		ob11.m2(56);
		AClass.SubClass22 ob22=new AClass.SubClass22();
		ob22.m2(64);
		}

}
