
public class Car {
//field
	String company = "BMW";
	String model = "M";
	String color;
	int maxSpeed;
	int currSpeed;
	
	//method overloading
	void start(){
		System.out.println(
				"시동 부릉부릉!");
		
	}
	
	void start(String word){
		System.out.println(
				"시동 부릉부릉!" 
		+ word);
	}
	
	int add(int a, int b) {
		int result;
		result = a+b;
		return result;
	}
	
	int add(int a, int b, int c) {
		int result;
		result = add(a,b)+c;
		return result;
	}
	
	
	int add(double a, double b) {
		double result;
		result = a+b;
		return (int)result;
	}
	
	
	
	//Car() {}
	Car(int _maxSpeed){
		//초기화
		color = "Blue";
		maxSpeed = _maxSpeed;
		currSpeed = 0;
	}
	
	Car(String _color){
		//초기화
		color = _color;
		maxSpeed = 300;
		currSpeed = 0;
	}
	
	Car(String _color, 
			int _maxSpeed){
		//초기화
		color = _color;
		maxSpeed = _maxSpeed;
		currSpeed = 0;
	}
	
}
