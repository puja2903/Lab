package com.CMS.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.CMS.CMSLodder;

public class Main {
	public static void main(String[] args) {
		CMSLodder cms=new CMSLodder();
		Scanner sc=new Scanner(System.in);
		System.err.println("Welcome to college website");
		while(true) {
			System.out.print("press 1: For new user Registration,\n"
					+ "press 2:Login account ,\n"
					+ "press 3:Admission,\n"
					+ "press 4:Display details ,\n"
					+ "press 5:update,\n"
					+ "press 6:Log out,\n"
					+"press 0:exit");
			int choice=sc.nextInt();
			while(!(choice>=0 && choice<7)) {
				System.err.println("Invalid choice \nTry Again : ");
				choice=sc.nextInt();
			}
			if(choice==0) {
				System.err.println("Thank you for choosing our college");
				break;
			}else {
				try {
					if(choice==1) {
						cms.insertData();
					}else if(choice==2) {
						cms.logIn();
					}}catch(InputMismatchException e) {
						System.out.println("Invalid entry");
					}catch(Exception e) {
						System.out.println(e.getMessage());
					}finally {
						System.err.println("1==Main Menu,\n0==Exit");
						int choice1=sc.nextInt();
						while(!(choice1==0||choice1==1)) {
							System.out.println("Invalid choice \nTry Again : ");
							choice1=sc.nextInt();
						}
						if(choice1==1) {
							continue;
						}else if(choice1==0) {
							System.err.println("Thank you for choosing our college");
							break;
						}
					}
				}
			}

}}