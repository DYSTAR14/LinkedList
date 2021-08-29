package com.blz.linkedlist;

public class LLOperations<K> {
	Node<K> head;

	public LLOperations<K> addFirst(LLOperations<K> myList, K element) {
		Node<K> newNode = new Node<K>(element);
		if (head == null) {
			head = newNode;
			System.out.println("Enter Value at Start:" + newNode.data);
		} else {
			newNode.next = head;
			head = newNode;
			System.out.println("Enter Value at Start:" + newNode.data);
		}
		return myList;
	}
	
	public void display(LLOperations<K> myList) {
		if (head == null) {
			System.out.println("Linked list is Empty");
		} else {
			Node<K> temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
