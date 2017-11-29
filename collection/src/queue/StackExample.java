package queue;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> coinBox = new Stack<Integer>();
		
		coinBox.push(100); //old
		coinBox.push(200); 
		coinBox.push(500); //new
		
		Integer in = coinBox.pop();//500
		System.out.println(in);
		
		in = coinBox.pop();//500
		System.out.println(in);
		
		in = coinBox.pop();//500
		System.out.println(in);

	}
}

