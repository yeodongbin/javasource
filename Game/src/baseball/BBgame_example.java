package baseball;

public class BBgame_example {

	public static void main(String[] args) {
		BBgame bb = new BBgame();
		bb.compareNum();

		boolean run = true;
		int inputNum = 0;
		int strike;

		// BBgame ��ü ����
		BBGame_son bbgame = new BBGame_son();

		// �ʱ� ��¹�
		System.out.println("���ھ߱� ������ �����մϴ�.");

		// bbgame�� ���� �޼��� ȣ��
		bbgame.randomAnswer();

		// strike�� 3�̰ų�, out�� 3�ϰ�� �ݺ��� ����
		while (run) {
			// bbgame�� ��¹� ȣ��
			bbgame.printFrist();

			// �Է¹��� 3�ڸ� ���ڸ� inputNum�� ����
			inputNum = bbgame.scanAnswer();

			// bbgame�� ���� �޼��带 ȣ��, inputNum�� �Ű������� �ϸ�, �����޼����� strike��ȯ ���� strike�� ����
			strike = bbgame.bbJudgment(inputNum);

			// strike�� 3�� ��� �ݺ��� ����
			if (strike == 3) {
				System.out.println("����~! �����մϴ�~");
				run = false;
			}

			// out�� 3�� ��� �ݺ��� ����
			if (bbgame.out == 3) {
				System.out.println("���ӿ���");
				run = false;
			}

			// ��ȸ bbgame�� strike, ball �ʵ尪�� 0���� �ʱ�ȭ
			bbgame.strike = 0;
			bbgame.ball = 0;
		}

	}

}
