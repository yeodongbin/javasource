package tv_package;

public class LG_tv extends Tv {
//field
	String panel = "OLED";
	
	//������
	public LG_tv(String maker, 
				 String tvSize, 
			     String tvType,
			     String quality) {
		super(maker, tvSize, tvType, quality); //�θ� Ŭ����
		maker = "LG";
	}
	
	//�ż���
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
