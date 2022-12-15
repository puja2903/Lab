package com.CMS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import College.Helper;

class DuplicateregException extends Exception{
	DuplicateregException(String str){
		super(str);
	}
}

class RegistrationNotFoundException extends Exception{
	RegistrationNotFoundException(String str){
		super(str);
	}
}

public class CMSLodder {     //main class
	
	int reg_id,ph_no,passing_year;
	double mark1,mark2;
	String name,address,course;


	Scanner sc=new Scanner(System.in);

	//insert data
	public void insertData() throws SQLException, DuplicateregException{
		System.out.println("enter reg_id : ");
		  reg_id=sc.nextInt();
		System.out.println("enter name: ");
		  name=sc.next();
		System.out.println("enter address: ");
		address=sc.next();
		System.out.println("enter course: ");
		course=sc.next();
		System.out.println("enter ph_no: ");
		ph_no=sc.nextInt();
		System.out.println("enter 10th_marks: ");
	    mark1=sc.nextDouble();
	    while(mark1<490) {
			System.err.println("Minimum 70% marks required for this course"
					+ "\nTry again : ");
			System.out.println("enter 10th_marks: ");
			mark1=sc.nextDouble();
		}
	    System.out.println("enter 12th_marks: ");
	    mark2=sc.nextDouble();
	    while(mark2<350) {
			System.err.println("Minimum 70% marks required for this course"
					+ "\nTry again : ");
			 System.out.println("enter 12th_marks: ");
			mark2=sc.nextDouble();
		}
		System.out.println("enter passing_year: ");
		 passing_year=sc.nextInt();
		 while(passing_year!=2021) {
			 System.out.println("you are not eligible"
					 +"\nTry again");
			 System.out.println("enter passing_year: ");
			 passing_year=sc.nextInt();
		 }
		 Connection conn=Helper.con();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select Registration_id from admission where Registration_id="+reg_id);
			if(rs.next()) {
				throw new DuplicateregException("Duplicate registration id not allowed");
			}else {
				PreparedStatement pstmt=conn.prepareStatement("insert into admission values(?,?,?,?,?,?,?,?)");
				pstmt.setInt(1,reg_id);
				pstmt.setString(2, name);
				pstmt.setString(3, address);
				pstmt.setString(4, course);
				pstmt.setInt(5, ph_no);
				pstmt.setDouble(6, mark1);
				pstmt.setDouble(7,mark2);
				pstmt.setInt(8,passing_year);
				pstmt.executeUpdate();
				System.err.println("your registration done");
			}
	}
	//log in
	public void logIn() throws SQLException, RegistrationNotFoundException{
		Connection conn=Helper.con();
		Statement stmt=conn.createStatement();
		System.out.println("Enter account no. : ");
		reg_id=sc.nextInt();
		ResultSet rs=stmt.executeQuery("select * from admission where Registration_id="+reg_id);
		if(!rs.next()) {
			throw new RegistrationNotFoundException("Registration id not found"+
		"\nEnter correct registration id or create a new account");
		}else {
			System.out.println("[Student name] : "+rs.getString(1)+
					"\n[Student Address] : "+rs.getString(2)+
					"\n[Course] : "+rs.getString(3)+
					"\n[ph_no] : "+rs.getInt(4));
		}
	}
	}