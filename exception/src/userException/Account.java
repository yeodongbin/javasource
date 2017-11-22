package userException;

public class Account {
	private int balance;
	
	public Account() {};
	
	public int getBalance() { //통장 확인
		return balance;
	}
	
	public void deposit(int money) { //저금
		balance = balance + money;
	}
	
	public int withdraw(int money) throws BIException { //인출
		if (balance < money) {
			//예외처리
			throw new BIException("돈이 모자라");
		}
		balance = balance - money;
		
		return money;
	}
	
}
