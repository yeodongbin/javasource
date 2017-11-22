package userException;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();

		account.deposit(100000);
		System.out.println(account.getBalance());

		try {
			account.withdraw(200000);
		} catch (BIException e) {
			String message = e.getMessage();
			System.out.println(message + "\n");
			e.printStackTrace();
		}

	}

}
