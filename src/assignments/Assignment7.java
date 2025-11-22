package assignments;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Now based on below details, print whether user is eligible to get the loan or not
		String customerName = "Sudam Karangal";
		int creditScore = 650;
		double income = 45000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 42.0;
		
		System.out.println("Evaluation for customer...: "+customerName);
       
		if(creditScore>750)
		{
			System.out.println("Excellent credit score: Congrats your loan is approved....");
		}
		else if(creditScore >=650)
		{//If the credit score is between 650 and 750, additional checks are performed.
			//income
			if(income>=50000)
			{
				//Employment Status:
				if(isEmployed==true)
				{
					//Debt-to-Income Ratio:
					if(debtToIncomeRatio<40)
					{
						System.out.println("Congratulations!.. your one lakh rupees loan is approved...:"+customerName);
					}
					else
					{
						System.out.println("We regreat to know you that your loan is not approved....due to low debtToIncomeRatio :"+debtToIncomeRatio);
					}
				
				}
				else
				{
					System.out.println("Customer is unemployed hence the loan is denied..");
				}
			}
			else
			{
				System.out.println("Hello sir: " +customerName+ " We regreat to know that you are not eligible for loan due low income :"+income);
			}
		}
		else if(creditScore<650)
		{
			System.out.println("Your loan is denied due to low credit score...");
		}
	}

}
