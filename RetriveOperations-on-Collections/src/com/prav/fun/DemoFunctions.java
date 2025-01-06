package com.prav.fun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DemoFunctions {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<Integer>();
		al.add(new Integer(2));
		 al.add(new Integer(7));
		 al.add(new Integer(9));
		 al.add(new Integer(5));
		 al.add(new Integer(10));
		 System.out.println("===List Before the Functions====");
		 al.forEach((k)->System.out.println(k));
		 Function<Integer,Integer> fn = (x)->x*x;
		 System.out.println("\n====List after function===");
		 al.forEach((k)->System.out.println(fn.apply(k)));
		 Predicate<Integer> pr=(x)->x%2==0;
		 System.out.println("\n====List after predicate===");
		 al.forEach((k)->System.out.println(pr.test(k)));
		 al.forEach((k)->{
			 if(pr.test(k))
			 {
				 System.out.println(k);
			 }
		 });
		 ArrayList<Integer> al2 = new ArrayList<Integer>();
		 al2.add(new Integer(2));
		 al2.add(new Integer(7));
		 al2.add(new Integer(9));
		 al2.add(new Integer(5));
		 al2.add(new Integer(10));
		 al2.replaceAll((x)->x+10);
		 System.out.println("\n====List after replaceAll()===");
		 al2.forEach((y)->System.out.print(y+" "));
		}

}
