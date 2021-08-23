import java.util.Scanner;

public class PerfectNumberUC2 {

	public static void main(String[] args) {
		int n, sum=0;  
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter the number: ");  
			n=scan.nextInt();         
		int i=1;  
		while(i <= n/2) //executes until the condition becomes false   
		{  
		if(n % i == 0)  
		{  
		 sum = sum + i; //calculates the sum of factors  
		} //end of if  
		i++;// increments the value of variable i by 1  
		} //end of while  
		if(sum==n) //compares sum with the number   
		{   
		System.out.println(n+" is a perfect number.");  //prints if sum and n are equal 
		} //end of if  
		else  
		System.out.println(n+" is not a perfect number.");  //prints if sum and n are not equal   
		}
		}
}


