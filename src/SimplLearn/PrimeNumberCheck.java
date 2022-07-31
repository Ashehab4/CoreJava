package SimplLearn;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to check if it is truly prime number or not: ");
			int num= sc.nextInt();
			boolean flag = true;
			if (num<=1) {
				System.out.println("Please enter a valid Number greater than 1");
				flag =false;
						}
				
			
			
			for (int i = 2; i < num; i++) {
				int reminder = num%i;
				
			
				
				if (reminder==0) {
					System.out.println("Number is not prime");
					flag =false;
					break;
				}
				
			}
			if(flag==true) {
				System.out.println("Number is  a prime number");
			}
		}

	}

}
