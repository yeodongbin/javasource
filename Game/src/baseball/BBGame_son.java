package baseball;

import java.util.Scanner;

public class BBGame_son {

	// �ʵ�
	private static int[] bbAnswer; // ������ ������ �迭
	int out = 0;
	int strike = 0;
	int ball = 0;

	// ������
	BBGame_son() {
		// ������ ������ �迭�� ��üȭ
		bbAnswer = new int[3];
	}

	// ��üũ �޼���
	public static int[] get() {
		int[] num = new int[bbAnswer.length];
		num = bbAnswer;
		return num;
	}

	// ���� ���� �޼���
	public static void randomAnswer() {
		// ������ �ӽ÷� ������ �迭
		int[] answerTemp = new int[bbAnswer.length];
		boolean run = true;
		int cnt = 0;

		// �信 �ߺ��� �Ȼ��涧���� �ݺ�
		while (run) {
			// �������� ���ڸ� �����ؼ� �迭�� �ִ� �ݺ���
			for (int i = 0; i < answerTemp.length; i++) {
				answerTemp[i] = (int) (Math.random() * 10);
			}

			// cnt�� 0���� �ʱ�ȭ ����, �ߺ��� üũ
			for (int i = 0; i < answerTemp.length; i++) {
				for (int j = i + 1; j < 3; j++) {
					if (answerTemp[i] == answerTemp[j]) {
						cnt++;
					}
				}
			}

			// cnt�� 0�� �ƴ� �ٸ� ������ ��� ���� �ݺ����� ��� ����, 0�̸� �ߺ� ���ſϷ� �Ǵ� ��������
			if (cnt == 0) {
				System.out.println("���� : " + answerTemp[0] + answerTemp[1] + answerTemp[2]);
				bbAnswer = answerTemp;
				run = false;
			}

			// cnt�� 0���� �ʱ�ȭ
			cnt = 0;
		}
	}

	// �Է� �޴� ���� ��� �޼���
	public static void printFrist() {
		System.out.println("���ڸ� �Է��ϼ���.");
		System.out.print("�Է� > ");
	}

	// ���� �Է� �޴� �޼���
	public static int scanAnswer() {
		Scanner scan = new Scanner(System.in);
		int inputNum = 0;
		inputNum = scan.nextInt();
		return inputNum;
	}

	// ���� �޼���
	public int bbJudgment(int answer) {
		// �Է¹��� ���ڸ� ���ڸ� ������ �迭
		int[] answerTemp = new int[bbAnswer.length];

		// �Է¹��� ���ڸ� ���� ������ �迭�� ����
		for (int i = 0; i < answerTemp.length; i++) {
			switch (i) {
			case 0:
				answerTemp[0] = answer / 100;
				break;
			case 1:
				answerTemp[1] = (answer / 10) % 10;
				break;
			case 2:
				answerTemp[2] = answer % 10;
				break;
			}
		}

		// ��Ʈ����ũ, ��, �ƿ� ����
		for (int i = 0; i < answerTemp.length; i++) {
			// ���� ��ġ�� ���� ������ ���
			if (bbAnswer[i] == answerTemp[i]) {
				strike++;
			}
			for (int j = 0; j < answerTemp.length; j++) {
				// �ٸ���ġ��
				if (i != j) {
					// ���� ������ ���
					if (bbAnswer[i] == answerTemp[j]) {
						ball++;
					}
				}
			}
		}

		// �ƿ� ����
		if ((strike == 0) && (ball == 0)) {
			out++;
		}

		// ��� ���
		System.out.println(strike + "��Ʈ����ũ " + ball + "�� " + out + "�ƿ�");

		// ��Ʈ����ũ �� ����
		return strike;
	}
}
