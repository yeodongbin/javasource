package promotion;

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class PromotionExample {//��ǥ Class
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a = new A();
	
	A ab = new B();
	A ac = new C();
	A ad = new D();
	A ae = new E();
	// ����� �ڽ� ��ü�� �ڵ� ����ȯ�� �����ϴ�
	
	B bd = new D();
	C ce = new E(); 
	/*
	C cd = new D();
	B be = new E();
	
	D da = new A();
	*/
}
