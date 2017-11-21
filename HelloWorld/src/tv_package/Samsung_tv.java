package tv_package;

public class Samsung_tv extends Tv{
	
	String panel = "LCD";
	
	public Samsung_tv(String maker, 
					  String tvSize, 
					  String tvType, 
					  String quality) {
		super(maker, tvSize, tvType, quality); //부모 클래스
		maker = "Samsung";
		
	}
}
