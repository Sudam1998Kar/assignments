package assignments;

public class Assignment11_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // A Prime number is a number greater than 1
				// that is divisible only by 1 and itself.
				
		
		int input=5;
		
		boolean prime=true;
		if(input<=1)
		{
			System.out.println("This is not a prime number");
			prime=false;
		}
		
		
		//2nd loop
		for(int i=2;i<input;i++)
		{
			if(input%i==0)
			{
				prime=false;
			}
		}
	
	//final decision afeter checking all posibilities
	if(prime)
	{
		System.out.println(input+" number is prime");
	}
	else
	{
		System.out.println(input+" is not a prime");
	}

}
}
