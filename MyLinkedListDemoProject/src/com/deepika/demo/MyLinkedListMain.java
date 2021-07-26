package com.deepika.demo;

import java.util.Scanner;

public class MyLinkedListMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyLinkedList myLinkedList=new MyLinkedList();
		while(true) {
			System.out.println("1. Add Element ");
			System.out.println("2. Display List ");
			System.out.println("3. Delete elem");
			System.out.println("4. Find frequency of digits");
			System.out.println("5. Exit");
			System.out.println("Enter Choice : ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element : ");
				int element=sc.nextInt();
				myLinkedList.insert(element);
				break;
			case 2:
				myLinkedList.traverse();
				break;
			case 3:
				System.out.println("Enter elem");
				int elem=sc.nextInt();
				myLinkedList.deleteNode(elem);
				break;
			case 4:
				myLinkedList.findFrequency();
				break;
			case 5:
				System.out.println("Thanks for creating link list");
				System.exit(0);
			}
			System.out.println("=========================");
		}

	}

}
