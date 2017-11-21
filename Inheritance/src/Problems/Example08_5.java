package Problems;

public class Example08_5 {
	public static void main(String[] args) {

	      Action ac = new Action() {
	         public void work() {
	            System.out.println("work!!");
	         }
	      };
	      
	      ac.work();
	   }
}

interface Action {
	void work();
}
