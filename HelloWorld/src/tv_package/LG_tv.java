package tv_package;

public class LG_tv extends Tv {
//field
	String panel = "OLED";
	
	//생성자
	public LG_tv(String maker, 
				 String tvSize, 
			     String tvType,
			     String quality) {
		super(maker, tvSize, tvType, quality); //부모 클래스
		maker = "LG";
	}
	
	//매서드
	@Override
	public int volumeUp(int upCount) {
		if (this.power ==true) {
			volumeUp();
		}
		System.out.println
		("volumeUp-Override");
		return volume;
	}
}
