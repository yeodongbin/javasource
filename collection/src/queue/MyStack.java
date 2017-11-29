package queue;

import java.util.*;

public class MyStack {
	List<Integer> vec;

	MyStack() {
		vec = new Vector<Integer>();
	}

	public void push(int num) {
		vec.add(num);
	}

	public Integer pop() {
		Integer popValue = vec.get(vec.size()-1);
		return popValue;
	}

	public void remove(int num) {
		vec.remove(num);
	}

	public void clear() {
		vec.clear();
	}
	
	public int size() {
		int size;
		size = vec.size();
		return size;
	}

	public static void main(String[] args) {
		MyStack mystack = new MyStack();
		mystack.push(1);
		mystack.push(2);
		mystack.push(123);
		
		System.out.println(mystack.size());
		System.out.println(mystack.pop());
		
		//System.out.println(mystack.pop());
		//System.out.println(mystack.pop());
		//System.out.println(mystack.pop());
	}
}