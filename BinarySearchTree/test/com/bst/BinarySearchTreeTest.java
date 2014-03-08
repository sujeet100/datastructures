package com.bst;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void bstTest() throws Exception {
		int[] data={4,7,3,13,8,1,18,5,2,9};
		final BinarySearchTree tree = new BinarySearchTree(data);
		tree.printPreety();
		assertEquals(3, tree.getHeight(tree.head));
	}
	
	@Test
	public void bstSearchTest(){
		int[] data={4,7,3,8,1};
		BinarySearchTree tree = new BinarySearchTree(data);
		assertEquals(7, tree.search(tree.head, 7).data);
		assertEquals(4, tree.search(tree.head, 4).data);
	}
}
