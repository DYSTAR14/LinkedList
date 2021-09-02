package com.blz.sortedlinkedlist;

public class Node<K> {
	K data;
	Node<K> next;

	public Node(K element) {
		data = element;
		next = null;
	}
}
