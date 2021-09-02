package com.blz.sortedlinkedlist;

import java.util.ArrayList;

public class SortedLLOperations<K> {
	Node<K> head;
	
	public  void insertSortLinkedList(SortedLLOperations<K> myList,K element) {
		Node<K> newNode = new Node<K>(element);
		if(head == null || ((Integer) head.data).compareTo((Integer) newNode.data) >=0) {
			addFirst(myList, element);
		}
		else {
			Node<K> temp = head;
			while ( temp.next != null && ((Integer) temp.next.data).compareTo((Integer) newNode.data) < 0) {
				temp = temp.next;
			}
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	public SortedLLOperations<K> addFirst(SortedLLOperations<K> myList, K element) {
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
	

	public SortedLLOperations<K> addLast(SortedLLOperations<K> myList, K element) {
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
	
	public SortedLLOperations<K> addAtNthPos(SortedLLOperations<K> list,K data,int pos) {
		Node<K> newNode = new Node<K>(data);
		int counter = 1;
		if(head == null) {
			head = newNode;
		}
		else if(counter == pos) {
			addFirst(list, data);
		}
		else if(counter < pos) {
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
	
	public SortedLLOperations<K> deleteFirst(SortedLLOperations<K> list) {
		if(head == null) {
			System.out.println("LinkedList is Empty");
		}
		Node<K> temp = head;
		head = temp.next;
		temp.next = null;
		return list;
	}
	
	public SortedLLOperations<K> deleteLast(SortedLLOperations<K> list) {
		if(head == null) {
			System.out.println("LinkedList is Empty");
		}
		Node<K> temp = head;
		Node<K> last = head;
		while (temp.next != null) {
			last = temp;
			temp = temp.next;
		}
		last.next = null;
		return list;
	}
	
	public SortedLLOperations<K> deleteAtNthPos(SortedLLOperations<K> list,int pos) {
		int counter = 0;
		if(head == null) {
			System.out.println("LinkedList is Empty");
		}
		else if(counter == pos) {
			Node<K> temp = head;
			head = temp.next;
			temp.next = null;
		}
		else if(counter < pos) {
			Node<K> temp = head;
			Node<K> last = head;
			while(temp.next != null && counter < pos) {
				counter++;
				last = temp;
				temp = temp.next;
			}
			last.next = temp.next;
			temp.next = null;
		}
		return list;
	}
	
	public ArrayList<K> display(SortedLLOperations<K> myList) {
		ArrayList<K> myListDisplay = new ArrayList<K>();
		if (head == null) {
			System.out.println("Linked list is Empty");
		} else {
			Node<K> temp = head;
			while (temp.next != null) {
				myListDisplay.add(temp.data);
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
			System.out.println(temp.data);
			myListDisplay.add(temp.data);
		}
		return myListDisplay;
	}


	public K searchElement(SortedLLOperations<K> list, K element) {
		if (head == null) {
			System.out.println("Linked list is Empty");
			return null;
		} else {
			Node<K> temp = head;
			while (temp.next != null ) {
				if(temp.data == element) {
					return temp.data;	
				}
				else {
					temp = temp.next;					
				}
			}
			return temp.data;
		}
	}

}