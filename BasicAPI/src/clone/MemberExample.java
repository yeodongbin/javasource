package clone;

public class MemberExample {
public static void main(String[] args) {
	//���� ��ü ����
	Member original = new Member("ȫ�浿",25,new int[] {90,90}, new Car("�ҳ�Ÿ"));
    
			//���� ��ü�� ���� �Ŀ� ���� ��ü�� ���� ����
			Member cloned = original.getMember();
			cloned.scores[0] = 100;
			cloned.car.model = "�׷���";
			
			System.out.println("���� ��ü�� �ʵ尪");
			System.out.println("name :" + cloned.name);
			System.out.println("age : " + cloned.age);
			System.out.println("scores :" + "{");
			for(int i =0; i<cloned.scores.length; i++) {
				System.out.print(cloned.scores[i]);
				System.out.println((i==(cloned.scores.length-1))?"":",");
			}
			System.out.println("}");
			System.out.println("car :" + cloned.car.model);
			
			System.out.println("----------------------------------------------");
			
			System.out.println("���� ��ü�� �ʵ尪");
			System.out.println("name :" + original.name);
			System.out.println("age : " + original.age);
			System.out.println("scores :" + "{");
			for(int i =0; i<original.scores.length; i++) {
				System.out.print(original.scores[i]);
				System.out.println((i==(original.scores.length-1))?"":",");
			}
			System.out.println("}");
			System.out.println("car :" + original.car.model);
}
}
