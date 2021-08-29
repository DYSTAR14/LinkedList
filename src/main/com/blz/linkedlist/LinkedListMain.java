package com.blz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
	public static LLOperations<Integer> list = new LLOperations<Integer>();
	static final Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Single LinkedList World");
		System.out.println("1.Add First\n2.Add Last\n3.Add Nth Position\n"
				+ "4.Delete First\n5.Delete Last\n6.Delete Nth Position\n" + "7.Search\n8.Display LinkedList\n0.Exit");
		int exit = 1;
		while (exit != 0) {
			System.out.println("Select From Option");
			int option = SC.nextInt();
			switch (option) {
			case 0:
				exit = 0;
				System.out.println("Thank you For\nParticipation LinkedList.");
				break;
			case 1:
				System.out.println("Enter Value");
				list.addFirst(list, SC.nextInt());
				break;
			case 8:
				list.display(list);
				break;
			default:
				break;
			}
		}
	}
}
