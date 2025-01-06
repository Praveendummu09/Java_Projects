package maccess;
import java.util.*;
public class DequqDemo1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
		dq.add(10);
		dq.addFirst(14);
		dq.addLast(12);
		dq.add(new Integer(11));
		dq.add(new Integer(13));
		dq.offer(16);
		System.out.println(dq);
		dq.addFirst(new Integer(400));
		dq.addLast(new Integer(500));

		System.out.println("****Remove First and Last******");
		System.out.println(dq.pollFirst());
		System.out.println(dq);
		System.out.println(dq.pollLast());
		System.out.println(dq);
		System.out.println("First ele :"+dq.peekFirst());
		System.out.println("Last ele"+dq.peekLast());
		System.out.println("****fisrtOccurrence(Object)***");
		System.out.println(dq.removeFirstOccurrence(10));
		System.out.println(dq);
		Iterator<Integer> it=dq.descendingIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}

}
