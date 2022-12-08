/*Problem Statement 4:Write a Java program to compare two array lists.*/
package LAB;
import java.util.ArrayList;
public class CompareArrayList {  //main class
public static void main(String ...args) {  //main method
	ArrayList<String> al=new ArrayList<String>();//creating 1st array list
	//adding elements
	al.add("Red");
	al.add("Green");
	al.add("Black");
	al.add("Pink");
	ArrayList<String> al2=new ArrayList<String>();//creating 1st array list
	//adding elements
	al2.add("Red");
	al2.add("Green");
	al2.add("Black");
	al2.add("White");
	al2.add("Pink");
	ArrayList<String> as = new ArrayList<String>();
     for (String e : al2)  //using for each loop
       as.add(al.contains(e) ? "Yes" : "No");
     System.out.println(as);  //printing the output   
     }}
