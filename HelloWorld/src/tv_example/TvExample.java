package tv_example;

import tv_package.*;

public class TvExample {
	public static void main(String[] args) {
		Tv tv = new Tv
				("Samsung",
				 "60��ġ",
				 "stand type",
				 "UHD");
		tv.volumeUp(10);
				
		LG_tv lg_tv = 
				new LG_tv("Samsung",
				 "60��ġ",
				 "stand type",
				 "UHD");
		lg_tv.powerOn();
		lg_tv.volumeUp(10);
				
		Samsung_tv samsung_tv = 
				new Samsung_tv("Samsung",
				 "60��ġ",
				 "stand type",
				 "UHD");
		samsung_tv.powerOn();
		samsung_tv.volumeUp(10);
		
		
	}
}
