package list;

import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		List<Board> vec = new Vector<Board>();

		vec.add(new Board("1","1","1"));
		vec.add(new Board("2","2","2"));
		vec.add(new Board("3","3","3"));
		vec.add(new Board("4","4","4"));
		vec.add(new Board("5","5","5"));
		
		vec.remove(0);
		
		Board board =vec.get(2);
		System.out.println(board.subject + " " + 
				board.content + " " +
				board.writer);
		
	}
}

class Board {
	String subject;
	String content;
	String writer;
	
	public Board(String subject, String content, String writer)	{
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}
