package com.blz.linkedlist;

import java.util.Scanner;

public class LinkedListMain {
	public static LLOperations<Integer> list = new LLOperations<Integer>();
	static final Scanner SC = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Single LinkedList World");
		list.addFirst(list, 56);
		list.addFirst(list, 30);
		list.addFirst(list, 70);
		list.display(list);
	}
}
