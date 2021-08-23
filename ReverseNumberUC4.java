import java.util.Scanner;

public class ReverseNumberUC4 {

	public static void main(String[] args) {
		int num=0, reversenumber=0;
		System.out.println("enter a number");
		try (Scanner scan = new Scanner(System.in)) {
		num = scan.nextInt();
		while(num !=0)
			{
			reversenumber = reversenumber * 10;
			reversenumber = reversenumber + num%10;
			num = num/10;
			}
		System.out.println("Reverse  of entered number is: "+reversenumber);
		}
	}
}
