package com.blz.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.blz.linkedlist.LLOperations;

public class NodeSearchTest {

	public static LLOperations<Integer> list;
	
	@Before
	public void addNode() {
		list = new LLOperations<Integer>();
		list.addLast(list, 50);
		list.addLast(list, 20);
		list.addLast(list, 30);
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


}
