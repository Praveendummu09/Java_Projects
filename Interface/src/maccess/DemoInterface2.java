package maccess;
import test.*;
import java.util.*;
public class DemoInterface2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("====Choice===");
		System.out.println("1.GreaterValue\n2.SmallerValue");
		System.out.println("enter the option :");
		switch(sc.nextInt()) {
		case 1:
			GreaterValue gv=new GreaterValue();
			System.out.println("Greater value :"+gv.compare(5, 9));
			break;
		case 2:
			SmallerValue sv=new SmallerValue();
			System.out.println("Smaller value :"+sv.compare(5, 9));
			break;
		default :
			System.out.println("Invalid option");
		}
		sc.close();

	}

}
