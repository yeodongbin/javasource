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
	@Override  // clone 메소드 재정의
	protected Object clone() throws CloneNotSupportedException{
		//먼저 얕은 복사로 name,age를 복제한다.
		Member cloned = (Member) super.clone();
		//scores를 깊은 복제한다
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car를 깊은 복제한다
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone(); //clone메소드의 리턴타입은 Object이므로 Member 타입으로 변환
		} catch (CloneNotSupportedException e) {}
		return cloned;
	}
}

