package queue;
import java.util.*;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.offer(500);
		q.offer(200);
		q.offer(100);
		
		Integer out = q.poll();
		System.out.println(out);//500
		
		out = q.poll();
		System.out.println(out);//500
		
		out = q.poll();
		System.out.println(out);//500

	}

}
