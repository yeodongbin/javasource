package goliath;

public class GAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GtoA ga = new GtoA() {
			public void attackAir() {
				System.out.println("�͸� ���� ��ü");
			}
		};
		
		ga.attackAir();
	}
}
