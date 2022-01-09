package week3.day1.assignment.Assignment3;

public class AxisBankInfo 
{
	
	public void deposit()
	{
		System.out.println("This is AxisBankInfo Class deposit.");
	}

	public static void main(String[] args) 
	{
		AxisBankInfo bnk = new AxisBankInfo();
		// This AxisBankInfo class deposit method Overrides BankInfo class deposit method. 
		bnk.deposit();
	}

}
