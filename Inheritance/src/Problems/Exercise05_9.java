package Problems;

import java.util.*;

public class Exercise05_9 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while (run) {
			printMenu();

			int selectNo = scanner.nextInt();

			/*
			if (selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
			} else if (selectNo == 2) {
				scores = inputScores(studentNum, scores, scanner);
			} else if (selectNo == 3) {
				if (studentNum > 0) {
					for (int i = 0; i < studentNum ; i++) {
						System.out.println("scores[" + i + "] : " + scores[i]);					
					}
				}
			} else if (selectNo == 4) {
				if (studentNum > 0) {
					maxValue(studentNum, scores);
					avgValue(studentNum, scores);
				}
			} else if (selectNo == 5) {//����
				run = false;
			}*/

			switch (selectNo) {
			case 1:
				System.out.print("�л���> ");
				studentNum = scanner.nextInt();
				break;
			case 2:
				scores = inputScores(studentNum, scores, scanner);
				break;
			case 3:
				printScores(studentNum, scores);
				break;
			case 4:
				if (studentNum > 0) {
					maxValue(studentNum, scores);
					avgValue(studentNum, scores);
				}
				break;
			default:
				run = false;
			}
		}
		
		System.out.println("���α׷� ����");
	}
	
	 public static void printScores( int studentNum, int[]scores) {
	      if(studentNum > 0) {
	         for(int i=0; i<studentNum; i++) {
	            System.out.println("scores[" +i+ "] : "+scores[i]);
	         }
	      } 
	 }

	protected static int[] inputScores(int studentNum, int[] scores, Scanner scanner) {
		if (studentNum > 0) {
			scores = new int[studentNum];
			for (int i = 0 ; i < studentNum ; i++) {
				System.out.print("scores[" + i +"]>");
				scores[i]= scanner.nextInt();	
			}
		} else {
			System.out.println("1.�л����� �Է��ϼ���.");
		}
		return scores;
	}

	protected static void printMenu() {
		System.out.println("--------------------------------------------");
		System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
		System.out.println("--------------------------------------------");
		System.out.print("����>");
	}

	private static void avgValue(int studentNum, int[] scores) {
		int sum = 0;
		for (int i = 0; i<studentNum ; i++) {
				sum += scores[i];
		}
		System.out.println("������� : " + (sum/studentNum));
		
		return;
	}
	
	private static void maxValue(int studentNum, int[] scores) {
		int maxValue = scores[0];
		for (int i = 1; i<studentNum ; i++) {
			if (maxValue < scores[i]) {
				maxValue = scores[i];
			}
		}
		System.out.println("�ְ����� : " + maxValue );
	}

}
