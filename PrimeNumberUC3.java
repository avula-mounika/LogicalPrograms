import java.util.Scanner;

public class PrimeNumberUC3 {

	public static void main(String[] args) {
		int number;
		boolean isPrime=true;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any number:");// the input in an integer
		int num=scan.nextInt();
	        scan.close();
		for(int i=2;i<=num/2;i++)
		{
	           number=num%i;
		   if(number==0)
		   {
		      isPrime=false;
		      break;
		   }
		}
		//If isPrime is true then the number is prime else not
		if(isPrime)
		   System.out.println(num + " is a Prime Number");
		else
		   System.out.println(num + " is not a Prime Number");
	   
	}

}
