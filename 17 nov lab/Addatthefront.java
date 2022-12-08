
//Write a Java program to insert the specified element at the front of a linked list.

package LAB;

import java.util.LinkedList;

public class Addatthefront {
public static void main(String ...args) {
	LinkedList<String> ll=new LinkedList<String>();//creating 1st LinkedList
	ll.add("cat");
	ll.add("dog");
	ll.add("lion");
	ll.add("tiger");
	ll.add("giraffe");
	ll.add("cow");
	System.out.println("print the LinkedList: "+ll);
	
	ll.addFirst("Mouse");
	System.out.println("After adding :"+ll);
	
}
}
