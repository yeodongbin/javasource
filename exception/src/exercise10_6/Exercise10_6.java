package exercise10_6;

public class Exercise10_6 {
	public static void main(String[] args) {
		String[] strArray = { "10", "20" };
		int value = 0;
		for (int i = 0; i < 2; i++) {

			try {
				value = Integer.parseInt(strArray[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε����� �ʰ�����");
				e.printStackTrace();
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� ��ȯ�� �� ����");
				e.printStackTrace();
			} finally {
				System.out.println(value);
			}
		}
	}
}
