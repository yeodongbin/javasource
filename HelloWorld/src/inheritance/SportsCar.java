package inheritance;

public class SportsCar extends Car {//child
	/*
	String company = "BMW";
	int maxSpeed = 200;
	int tire =4; 
	 */
	
	int airbag = 8;
	
	SportsCar () {
		//super(); //default
//		super("dongbin");
		System.out.println
		("SportsCar()");
		this.maxSpeed = 300;
	}	
	
	void run() {
		System.out.println
		("스포츠카가 달립니다.");
	}
}
