package com.blz.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;

import org.junit.Test;

import com.blz.linkedlist.LLOperations;


public class NodeSearchTest<E> {

	public static LLOperations<Integer> list;
	public static LLOperations<Integer> list1;
	@Before
	public void addNode() {
		list = new LLOperations<Integer>();
		list.addLast(list, 50);
		list.addLast(list, 20);
		list.addLast(list, 40);
		list.addLast(list, 70);
	}
	
	@Test
	public void testSearchElement_Sucess() {
		Integer expected = 70;
		Integer actual = list.searchElement(list, 70);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSearchElement_fail() {
		Integer expected = 80;
		Integer actual = list.searchElement(list, 80);
		assertNotEquals(expected, actual);
	}
  
	
	@Test
	public void testInsertAtPos_Sucess() {
		List<Integer> expected = Arrays.asList(50,20,30,40,70);
		list.addAtNthPos(list, 30, 2);
		ArrayList<Integer> actual = list.display(list);
	    assertEquals(expected, actual);
	}

}

