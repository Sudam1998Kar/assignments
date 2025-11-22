package assignments;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//store values in array
		int[] transcations= {50000,-2000,3000,-15000,-200,-300,4000,-3000};
        
		//all variables
		int totalCredits = 0;
		int totalDebits = 0;
		int totalCreditAmount = 0;
		int totalDebitAmount = 0;
		int suspiciousTransactions = 0;
		
		
		//iterate through each transctions in the array
		for(int amount:transcations)
		{
			if(amount>0)
			{//credit transaction
				totalCredits++;
				totalCreditAmount+= amount;
				//check suspicious activity
				if(amount>10000)
				{
					System.out.println("Suspicious credit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			
			}
			else
			{
				//it is debit transaction
				totalDebits++;
				totalDebitAmount-=amount;//convert to positive and then add to total debit amount
				
			 //check for suspicous large debit transaction
				if(amount<-10000)
				{
					System.out.println("Suspicious debit transaction with Amount: " + amount);
					suspiciousTransactions++;
				}
			}
		}
		
		//final balance total credit minus total debit
		int finalBalance= totalCreditAmount-totalDebitAmount;
		
		// Print a summary of the account activity
				System.out.println("----- Transaction Summary -----");
				System.out.println("Total number of credit transactions: " + totalCredits);
				System.out.println("Total number of debit transactions: " + totalDebits);
				System.out.println("Total amount credited: " + totalCreditAmount);
				System.out.println("Total amount debited: " + totalDebitAmount);
				System.out.println("Final remaining amount in the account: " + finalBalance);
				System.out.println("Total number of suspicious transactions: " + suspiciousTransactions);
		}
	}



