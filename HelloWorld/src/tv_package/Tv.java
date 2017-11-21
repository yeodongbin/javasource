package tv_package;

public class Tv {

	// field
	boolean power = false;
	private boolean mute;
	int volume;
	private int preVolume;
	private int channel;

	String maker;
	String tvSize;
	String tvType;
	String quality;
    final String design_date = "20171115";

	// constructor
	Tv() {
		this.mute = false;
		this.volume = 5;
		this.channel = 7;// KBS2
	}

	public Tv(String maker, String tvSize, String tvType, String quality) { // �ʱ�ȭ
		this();
		this.maker = maker;
		this.tvSize = tvSize;
		this.tvType = tvType;
		this.quality = quality; // ȭ��
	}

	// method
	public void powerOn() {
		this.power = true;
		System.out.println("TV Power ON");
	}

	void powerOff() {
		this.power = false;
		System.out.println("TV Power Off");
	}

	public int volumeUp() {
		if (power == true) {
			this.volume++;
		}
		System.out.println("volumeUp");
		return volume;
	}
	//Ÿ��
	public int volumeUp(int upCount) { //Overloading
		if (power == true) {
			volume = volume 
					+ upCount;
		}
		System.out.println
		("volumeUp("+upCount+ ")");
		return volume;
	}

	int volumeDown() {
		if (power == true) {
			this.volume--;
		}
		return volume;
	}

	int channelUp() {
		if (power == true) {
			this.channel++;
		}
		return channel;
	}

	int channelDown() {
		if (power == true) {
			this.channel--;
		}
		return channel;
	}
	
	public int choiceChannel(int futureCha) {
		int dif=0;
		
		if ((futureCha - channel) > 0) {
			dif = futureCha - channel;//4
			for (int i=0;i<dif;i++) {
				channelUp();
			}
			System.out.println(futureCha + "�� �Դϴ�.");			
		} else if ((futureCha - channel) < 0) {
			dif = channel - futureCha;
			for (int i=0; i<dif;i++) {
				channelDown();
			}
			System.out.println(futureCha + "�� �Դϴ�.");
		} else {
			System.out.println("���� ä���� " 
							   + futureCha 
							   + "�� �Դϴ�.");
		}
		/*
		switch ((futureCha - channel)) {
		case 4: case 3: case 2:	
		case 1:
			dif = futureCha - channel;//4
			for (int i=0;i<dif;i++) {
				channelUp();
			}
			System.out.println(futureCha + "�� �Դϴ�.");
			break;
			
		case 0:
			System.out.println("���� ä���� " + futureCha 
							 + "�� �Դϴ�.");
			break;
			
		case -1: case -2: case -3: 
		case -4:
			dif = channel - futureCha ;
			for (int i=0; i<dif;i++) {
				channelDown();
			}
			System.out.println(futureCha + "�� �Դϴ�.");
			break;
		//default :	
		}*/
		
	
		return this.channel; 
	}

	boolean muteOn() {
		if (power == true) {
			if (mute == true) {
				System.out.println("���Ұ� �����Դϴ�.");
			} else {
				preVolume = volume;
				this.volume = 0;
				mute = true;
				System.out.println("���Ұ� �Ǿ����ϴ�.");
			}
		}

		return mute;
	}

	boolean muteOff() {
		if (power == true) {
			if (mute == true) {
				this.volume = preVolume;
				mute = false;
				System.out.println("���ҰŰ� �����Ǿ����ϴ�.");
			} else {
				System.out.println("mute�� Off �����Դϴ�.");
			}
		}

		return mute;
	}
}
