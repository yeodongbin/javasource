package promotion;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		Parent parent2 = new Parent();
		
		parent2.method1(parent); //Child
		parent2.method1(parent2); //Parent
		parent2.method1(child);   //Child
		
		parent2.method2(parent); //Child
		parent2.method2(parent2); //Parent
		parent2.method2(child);
	}
}
