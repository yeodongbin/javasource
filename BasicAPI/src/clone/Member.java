package clone;

import java.util.Arrays;

public class Member implements Cloneable {
	public String name;
	public int age;
    public int[] scores;
    public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
        this.scores = scores;
        this.car = car;
	}
	@Override  // clone �޼ҵ� ������
	protected Object clone() throws CloneNotSupportedException{
		//���� ���� ����� name,age�� �����Ѵ�.
		Member cloned = (Member) super.clone();
		//scores�� ���� �����Ѵ�
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car�� ���� �����Ѵ�
		cloned.car = new Car(this.car.model);
		//���� ������ Member ��ü�� ����
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); //clone�޼ҵ��� ����Ÿ���� Object�̹Ƿ� Member Ÿ������ ��ȯ
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
}

