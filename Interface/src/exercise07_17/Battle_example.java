package exercise07_17;

public class Battle_example {

	public static void main(String[] args) {
		//#1 ��ü 
		Marine marine = new Marine();
		marine.move(1, 2);
		Tank tank = new Tank();
		tank.move(1, 2);
		Dropshop dropshop = new Dropshop();
		dropshop.move(1, 2);
		
		System.out.println("----------------");
		
		//#2 �ڵ�����ȯ
		Unit unit = new Marine();
		unit.move(1, 2);
		unit = new Tank();//reference �ּҰ�
		unit.move(1, 2);
		unit = new Dropshop();
		unit.move(1, 2);
		
		System.out.println("----------------");
		
		//#3
		unitMove(new Marine());
		unitMove(new Tank());
		unitMove(new Dropshop());
	}
	
	public static void unitMove(Unit unit) {
		unit.move(1,2);
	}

}
