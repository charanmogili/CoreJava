import java.util.Scanner;

class UnderAgeException extends Exception{
	public UnderAgeException(String message)
	{
		super(message);
	}
}

class OverAgeException extends Exception{
	public OverAgeException(String message)
	{
		super(message);
	}
}

class Applicant{
	int age;
	public void input()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter age");
		age=scan.nextInt();
	}
	void verify() throws UnderAgeException,OverAgeException
	{
		if(age<18)
		{
			UnderAgeException uae=new UnderAgeException("Oh! you're below 18");
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60)
		{
			OverAgeException ove=new OverAgeException("Sit Back and Relax");
			System.out.println(ove.getMessage());
			throw ove;
		}
		else
		{
			System.out.println("You're eligible");
		}
	}
}

class Rto
{
	public void intiatate()
	{
		Applicant a=new Applicant();
		try {
		a.input();
		a.verify();
		}
		catch(UnderAgeException | OverAgeException e){
			try {
				a.input();
				a.verify();
				}
				catch(UnderAgeException | OverAgeException e1){
					System.out.println("Don't try again");
					System.exit(0);
				}
		}
	}
	}

public class CustExcep {

	public static void main(String[] args) {
		Rto rto=new Rto();
		rto.intiatate();
	}

}
