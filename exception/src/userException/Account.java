package userException;

public class Account {
	private int balance;
	
	public Account() {};
	
	public int getBalance() { //���� Ȯ��
		return balance;
	}
	
	public void deposit(int money) { //����
		balance = balance + money;
	}
	
	public int withdraw(int money) throws BIException { //����
		if (balance < money) {
			//����ó��
			throw new BIException("���� ���ڶ�");
		}
		balance = balance - money;
		
		return money;
	}
	
}
