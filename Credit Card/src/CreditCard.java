import java.util.Scanner;

public class CreditCard
	{
	static long bob;
	static long a;
	static long b;
	static int i;
	static long total=0;

	public static void main(String[] args)
		{
		Scanner myScan=new Scanner(System.in);
		System.out.println("Enter a 16 digit credit card number.");
		bob = myScan.nextLong();
		long[]myArray=new long [16];
		for(i=0; i<16; i++)
			{
			myArray[i]= bob % 10;
			bob=bob / 10;
			}
		for(i=0; i<16; i++)
			{
			if(i % 2==1)
				{
				myArray[i]=myArray[i]*2;
				if(myArray[i]>9)
					{
					a=myArray[i]%10;
					b=myArray[i]/10;
					myArray[i]=a+b;
					}
				}
			}
	
		for(i=0; i<myArray.length; i++)
			{
			total=total+myArray[i];
			}
		
		
		if(total % 10==0)
			{
			System.out.println("This is potentially a valid credit card.");
			}
		else 
			{
			System.out.println("That is not a valid credit card.");
			}

		}

	}
