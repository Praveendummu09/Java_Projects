package test;
import java.util.*;
public class DemoArray1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=Integer.parseInt(sc.nextLine());
		Integer a[]=new Integer[n];
		System.out.println("Enter "+n+" Integers");
		for(int i=0;i<n;i++)
		{
			a[i]=new Integer(sc.nextInt());
		}
		System.out.println("===Display Array Old Method===");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i].toString()+" ");
		}
		System.out.println();
		System.out.println("===Display Array extend Method===");
		for(Integer k : a)
		{
			System.out.print(k.toString()+" ");
		}
System.out.println();
		System.out.println("===Display Array Spliterator Method===");
		Spliterator<Integer> ob=Arrays.spliterator(a);
		ob.forEachRemaining((k)->
		{
			System.out.print(k.toString()+" ");
		});
		sc.close();

	}

}
