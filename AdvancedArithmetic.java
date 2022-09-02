package LAB;
/*1… You are given a class AdvancedArithmetic which contains a method signature int
divisor_sum(int n). You need to write another class called MyCalculator which implements the 
method.
divisorSum method just takes an integer as input and return the sum of all its divisors. For 
example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12. The value of n will be at 
most 1000.
Read the partially completed code in the editor and complete it. You just need to write the 
MyCalculator class only. Your class shouldn't be public.*/
import java.util.Scanner;

public class AdvancedArithmetic {
	void divisorsum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if (n%i==0) {
				sum=sum+i;
	}}
		System.out.println("The sum of all divisor:"+sum);	
	}
	public static void main(String ...args) {
		Scanner ps=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=ps.nextInt();
		AdvancedArithmetic adv=new AdvancedArithmetic();
		adv.divisorsum(n);
	}
}

