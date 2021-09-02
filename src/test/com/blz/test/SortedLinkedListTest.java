package com.blz.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.blz.sortedlinkedlist.SortedLLOperations;

public class SortedLinkedListTest {

	SortedLLOperations<Integer> list;
	@Test
	public void testSortedLLInputOutputPattern_Sucess() {
		list = new SortedLLOperations<Integer>();
		List<Integer> expected = Arrays.asList(30,40,56,70);
		list.insertSortLinkedList(list, 56);
		list.insertSortLinkedList(list, 30);
		list.insertSortLinkedList(list, 40);
		list.insertSortLinkedList(list, 70);
		ArrayList<Integer> actual = list.display(list);
	    assertEquals(expected, actual);
	}
}

