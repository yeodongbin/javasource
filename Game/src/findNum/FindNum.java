package findNum;

import java.util.Scanner;

public class FindNum {
	//�ʵ� (����)
	int comNum;
	int userNum;
	
	//������
	FindNum() {};
	
	//�ż��� (�Լ�)
	void makeComNum() {
		comNum = (int) (Math.random() * 10);
		System.out.println(this.comNum);
	}
	
	void getUserNum() {
		Scanner sc = new Scanner(System.in);
		userNum = sc.nextInt();
	}
	
	void compareNum() {
		makeComNum();
		getUserNum();
		while (true) {
			if (comNum == userNum) {
				System.out.println("�����Դϴ�.");
				break;
			} else {
				System.out.println("������ �ƴմϴ�.");
				getUserNum();
			}
		}
	}
}
