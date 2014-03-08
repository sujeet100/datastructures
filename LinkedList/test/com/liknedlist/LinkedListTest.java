package com.liknedlist;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.linkedlist.LinkedList;

public class LinkedListTest {

	@Test
	public void linkedListTest() {
		LinkedList list = new LinkedList();
		List<Integer> data = new ArrayList<Integer>(){
			{
				add(1);
				add(3);
				add(5);
			}
		};
		list.createList(data);
		list.printList();
	}
	

}
