package com.cognizant.tax;
import java .util.Scanner;
public class TaxCalculator {
	//Problem Statement 1 : 
	
		//creating instance variable : 
		static float basicSalary,tax;
		static boolean citizenship;
		static int netSalary;
	
	//Problem Statement 2: 
		
		//creating method to calculate tax
		static void calculateTax() {
			tax=(30*basicSalary)/100;        //formula to calculate the tax
			System.out.println("The Tax of the employee  for  the "+basicSalary+" is "+tax);
		}
		
	//Problem Statement 3: 
		//method to deduct salary
		static void deductTax() {
			netSalary=(int) (basicSalary-tax);
			System.out.println("The nett salary of the employee : "+netSalary);
		}
	//Problem Statement 4: 
		
		//method to validate if the salary is > 1lakh and citizenship is true
		static void validateSalary() {
			boolean response=basicSalary>100000f && citizenship==true;
			if (response) {
				System.out.println("The salary and citizenship eligibility: "+response);
			}else {
				System.out.println("The salary and citizenship eligibility: "+response);
			}
		}
	}
	//Problem Statement 5:

	//creating a EmployeeTax class in the same package
	class EmployeeTax{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);      //creating scanner class
			
			//taking inputs
			System.out.println("Enter basic salary : ");
			TaxCalculator.basicSalary=sc.nextFloat();
			System.out.println("Enter citizenship (true if inside India otherwise false)");
			TaxCalculator.citizenship=sc.nextBoolean();
			sc.close();
			
			//calling the methods
			TaxCalculator .calculateTax();
			TaxCalculator.deductTax();
			TaxCalculator.validateSalary();
		}

	}