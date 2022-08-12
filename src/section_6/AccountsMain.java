package section_6;

public class AccountsMain {
	
	public static void main(String[] args) {
		
		Accounts anirudhAccount = new Accounts("403", 9999, "Anirudh", "anirudh.das@costrategix.com", "353636236");
		anirudhAccount.withdrawal(500);
		anirudhAccount.setBalance(9999);
		anirudhAccount.withdrawal(500);
	}
}
