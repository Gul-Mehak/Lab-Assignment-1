package banking;

public class BankingSystem{

static final String storedAccountNumber="123456";
static final String StoredPin="1234";

public static class LoginProcessor{
	
	public static boolean authenticate(String AccountNumber,String Pin){
		return AccountNumber.equals(storedAccountNumber) && Pin.equals(StoredPin);
	}
}

}