package queue;

import java.util.*;

public class MyQueue {

	List<Integer> vec;

	MyQueue() {
		vec = new Vector<Integer>();
	}

	public void offer(int num) {
		vec.add(num);
	}

	public int poll() {
		int temp = 0;
		temp = vec.get(0);
		vec.remove(0);
		return temp;
	}

	public void remove(int num) {
		vec.remove(num);
	}

	public void clear() {
		vec.clear();
	}

	public static void main(String[] args) {
		MyQueue myqueue = new MyQueue();
		myqueue.offer(1);
		myqueue.offer(2);
		myqueue.offer(3);

		System.out.println(myqueue.poll());
		System.out.println(myqueue.poll());
		System.out.println(myqueue.poll());
	}
}
