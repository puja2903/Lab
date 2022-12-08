/*Problem Statement 3:Write a Java program to extract a portion of an array list.*/
package LAB;

import java.util.ArrayList;
import java.util.List;

public class ExtractArratList {//main class
	public static void main(String[] args) { //main method
		  
 ArrayList<String> al = new ArrayList<String>();//creating the array list
		 
		  //add elements
		  al.add("Red");
		  al.add("Green");
		  al.add("Orange");
		 al.add("White");
		 al.add("Black");
 System.out.println("Original list: " + al);//printing the main array list
 List<String> al2 = al.subList(0, 3);//creating the list and take sub list to get the specific portion
		  System.out.println("After extracting the array list: " + al2);//printing after extracting
		 }
		}

