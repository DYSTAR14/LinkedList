package com.blz.sortedlinkedlist;

import java.util.Scanner;

import com.blz.linkedlist.LLOperations;

public class SortedLLMain {

	public static SortedLLOperations<Integer> list = new SortedLLOperations<Integer>();
	static final Scanner SC = new Scanner(System.in);
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Welcome to Sorted LinkedList World");
		System.out.println("1.Insert Element\n2.Display\n0.Exit");
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
				list.insertSortLinkedList(list, SC.nextInt());
				break;
			case 2:
				System.out.println("Enter Value");
				list.display(list);
				break;
			default:
				break;
			}
		}
	}

}
