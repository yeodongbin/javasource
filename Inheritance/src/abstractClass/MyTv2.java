package abstractClass;

public class MyTv2 extends Tv{
	private boolean isPowerOn = false;
	private int channel;
	private int volume;
	int preChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	MyTv2() {
		super("Korea");
	}
	
	@Override
	public void printLogo(String country) {
		System.out.println(super.logo + country);
	}
	
	@Override
	public void gotoPrevChannel() {
		int tempChannel=0;
		tempChannel = this.channel;
		this.channel = this.preChannel; 
		this.preChannel = tempChannel;
	}
	
	public boolean isPowerOn() {
		return isPowerOn;
	}
	
	public int getChannel() {
		if (isPowerOn == true) {
			return channel;
		}
		return -1;
	}
	
	public int getVolume() {
		if (isPowerOn ==true) {
		return volume;
		}
		return -1;
	}
	
	public void setIsPowerOn(boolean isPowerOn) {
		if ((this.isPowerOn == true)&&(isPowerOn == false)) {
			this.isPowerOn = isPowerOn; //��������
		} if ((this.isPowerOn == true)&&(isPowerOn == true)) {
			System.out.println("���� TV�� ���� �ֽ��ϴ�.");
		} if ((this.isPowerOn == false)&&(isPowerOn == true)) {
			this.isPowerOn = isPowerOn; //��������
		} if ((this.isPowerOn == false)&&(isPowerOn == false)) {
			System.out.println("..");
		}
	}

	public void setChannel(int channel) {
		if (this.isPowerOn == true) {
			if ((channel <= 100) && (channel >= 1)) {
				this.preChannel =this.channel; 
				this.channel = channel;
			} else {
				System.out.println("��ȿ�� ä���� �Է��ϼ���");
			}
		}
	}
	
	public void setVolume (int volume) {
		if (this.isPowerOn == true) { //����
			if ((volume <= 100)&&(volume >=0)) { //OK
				this.volume = volume;
			} else {
				System.out.println("��ȿ�� ������ �Է��ϼ���");
			}
		}
	}
}
