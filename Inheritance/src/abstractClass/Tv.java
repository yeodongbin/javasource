package abstractClass;

public abstract class Tv {
	
	final String logo = "Made in ";
	
	Tv(String country) {
		this.printLogo(country);
	}
	
	//logo ����Ͻÿ�
	public abstract void printLogo(String country);
	
	//���� ä���� ���� ä�η� �����Ѵ�.
	abstract void gotoPrevChannel();
	
}
