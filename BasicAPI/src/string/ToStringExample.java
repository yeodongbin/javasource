package string;

import java.util.Date;

public class ToStringExample {
public static void main(String[] agrs) {
	Object obj1 = new Object();
	Date obj2 = new Date();
System.out.println(obj1.toString()); //�⺻ Object ��� + Ŭ������@16���� �ؽ��ڵ�
	System.out.println(obj2.toString()); // obj2�� ������ date�� ������ ���ڿ��� ���
}
}
