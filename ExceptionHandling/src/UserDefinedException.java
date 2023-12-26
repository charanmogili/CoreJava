import java.util.Scanner;

class InvalidCredentialsException extends Exception{
	public InvalidCredentialsException(String msg) {
		super(msg);
	}
}

class ATM{
	int userId=1234;
	int password=1111;
	int uId;
	int pwd;
	
	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the UserID");
		uId=scan.nextInt();
		
		System.out.println("Enter the pwd");
		pwd=scan.nextInt();
	}
	public void verify() throws InvalidCredentialsException {
		
		if(uId==userId && password==pwd) {
			System.out.println("Collect your Cash");
		}
		else {
			InvalidCredentialsException ice=new InvalidCredentialsException("Are you Sure!");
			System.out.println(ice.getMessage());
//			ice.getMessage();123
			throw ice;
		}
		}
}

class Bank{
	public void initiate() {
		ATM atm=new ATM();
		try {
		atm.input();
		atm.verify();
		}catch(InvalidCredentialsException ice1) {
			System.out.println("You entered invalid credentials for 1st time.Try Again");
			try {
				atm.input();
				atm.verify();
				}catch(InvalidCredentialsException ice2) {
					System.out.println("You entered invalid credentials 2nd time.Try Again");
					try {
						atm.input();
						atm.verify();
						}catch(InvalidCredentialsException ice3) {
							System.out.println("You entered invalid credentials.You Exhauted maximum attempts");
							System.exit(0);
						}
				}
		}
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.initiate();
	}
}
