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
	

	public LLOperations<K> addLast(LLOperations<K> myList, K element) {
		Node<K> newNode = new Node<K>(element);
		if (head == null) {
			head = newNode;
			System.out.println("Enter Value at End:" + newNode.data);
		} else {
			Node<K> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			System.out.println("Enter Value at End:" + newNode.data);
		}
		return myList;	
	}
	
	public LLOperations<K> addAtNthPos(LLOperations<K> list,K data,int pos) {
		Node<K> newNode = new Node<K>(data);
		int counter = 0;
		if(head == null) {
			head = newNode;
		}
		else if(counter <= pos) {
			Node<K> temp = head;
			while(temp.next != null && counter < pos-1) {
				counter++;
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println("Enter Value at "+pos+" : "+ newNode.data);
		}
		return list;	
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
