package maccess;
import  java.util.*;
public class QueueDemo1 {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		q.add(new Integer(12));
		q.offer(new Integer(13));
		q.offer(new Integer(14));
		q.offer(new Integer(10));
		System.out.println(q);
		System.out.println("Peek ele :"+q.peek());
		System.out.println("element :"+q.element());
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.add(100);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
	}

}
