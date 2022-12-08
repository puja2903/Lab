/* Develop a java class with a method storeEvenNumbers(int N) using ArrayList to store 
even numbers from 2 to N, 
 where N is a integer which is passed as a parameter to the method storeEvenNumbers(). The method should return 
 the ArrayList (A1) created.  In the same class create a method printEvenNumbers()which iterates through the 
arrayList A1 in step 1, and It should multiply each number with 2 and display it in format 
4,8,12….2*N. and add these numbers in a new ArrayList (A2). The new ArrayList (A2)created needs to be returned
 Create a method retrieveEvenNumber(int N) parameter is a number N. This method should search the arrayList (A1)
  for the existence of the number ‘N’ passed. If exists it should return the Number else return zero.*/
package com.book;
import java.util.ArrayList;
import java.util.Scanner;
public class Assignment2 {
ArrayList<Integer> al = new ArrayList<Integer>();//creating array list
	  ArrayList<Integer> saveEvenNumbers(int N) {  //create method
		al = new ArrayList<Integer>();
		for (int i = 2; i <= N; i++) {//for loop
			if (i % 2 == 0) {
				al.add(i);
			System.out.println(i);}}
		return al;}
	 ArrayList<Integer> printEvenNumbers() { //create 2nd method
		ArrayList<Integer> al2 = new ArrayList<Integer>();//creating 2nd array list
		for (int i:al) { //for each loop
			al2.add(i*2);
			System.out.println(i*2);}
		return al2;}
	 ArrayList<Integer> retrieveEvenNumber(int N){ //creating another method
		 return al;  }
public static void main(String[] args) { //main method
	Assignment2 as = new Assignment2();//create the object of main class
		Scanner ps=new Scanner(System.in);//creating scanner class
		System.out.println("enter the  value of N: ");
		as.saveEvenNumbers(ps.nextInt());//calling
		as.printEvenNumbers();}}