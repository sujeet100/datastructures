package com.linkedlist;

import java.util.List;

public class LinkedList {
	
	Node head;
	
	public void createList(List<Integer> dataList) {

		for (Integer data : dataList) {
			insert(data);
		}
		
	}

	private void insert(Integer data) {
		Node node = new Node(data);
		Node temp = head;
		if(head == null){
			head = node;
		}else{
			while(temp.next!=null)
				temp = temp.next;
			temp.next = node;
		}
	}

	public void printList(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp= temp.next;
		}
	}
}
