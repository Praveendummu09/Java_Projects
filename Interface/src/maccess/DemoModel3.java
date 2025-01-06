package maccess;
import test.Model3IC;
import java.util.*;
public class DemoModel3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Model3IC ob=new Model3IC();
		System.out.println("enter x value");
		ob.m1(Integer.parseInt(sc.nextLine()));
		ob.dis(50);
		ob.m2(14);
		ob.m3(45);
		sc.close();
	}

}
