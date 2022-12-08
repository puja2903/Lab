/*Problem Statement 6:Write a Java program to replace an element in a
  linked list*/
package LAB;
import java.util.LinkedList;

public class ReplaceElementFromArrayList {//main class
public static void main(String ...args) {  //main method
LinkedList<Integer> ll=new LinkedList<Integer>();//creating 1st LinkedList
	//add elements
	ll.add(34);
	ll.add(56);
	ll.add(32);
	ll.add(14);
	ll.add(87);
	//Print the LinkedList before replacing the LinkedList
	System.out.println("Before replacing the LinkedList: "+ll);
	
	ll.set(3,67);//set the position and give the number that i want to replace
	
	//Print the LinkedList after replacing the LinkedList
    System.out.println("After replacing the LinkedList : " + ll);
	}}
