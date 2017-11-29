package string;

import java.util.Date;

public class ToStringExample {
public static void main(String[] agrs) {
	Object obj1 = new Object();
	Date obj2 = new Date();
System.out.println(obj1.toString()); //기본 Object 상속 + 클래스명@16진수 해시코드
	System.out.println(obj2.toString()); // obj2에 오늘의 date를 저장후 문자열로 출력
}
}
