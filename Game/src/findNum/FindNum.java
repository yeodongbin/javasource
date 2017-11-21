package findNum;

import java.util.Scanner;

public class FindNum {
	//필드 (변수)
	int comNum;
	int userNum;
	
	//생성자
	FindNum() {};
	
	//매서드 (함수)
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
				System.out.println("정답입니다.");
				break;
			} else {
				System.out.println("정답이 아닙니다.");
				getUserNum();
			}
		}
	}
}
