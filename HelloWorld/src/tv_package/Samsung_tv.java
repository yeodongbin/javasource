package tv_package;

public class Samsung_tv extends Tv{
	
	String panel = "LCD";
	
	public Samsung_tv(String maker, 
					  String tvSize, 
					  String tvType, 
					  String quality) {
		super(maker, tvSize, tvType, quality); //�θ� Ŭ����
		maker = "Samsung";
		
	}
}
