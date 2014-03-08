package com.bst;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {

	TreeNode head;

	public BinarySearchTree(int[] dataArray) {
		for (int i : dataArray) {
			insertNode(i);
		}
	}

	public void insertNode(int data) {
		TreeNode node = new TreeNode(data);
		head = insert(head, node);
	}

	private TreeNode insert(TreeNode head, TreeNode treeNode) {
		if (head == null) {
			head = treeNode;
		} else if (treeNode.data < head.data) {
			head.left = insert(head.left, treeNode);
		} else {
			head.right = insert(head.right, treeNode);
		}
		return head;
	}

	public void printPreety() {
		List<TreeNode> list = new ArrayList<TreeNode>();
		list.add(head);
		printTree(list, getHeight(head));
	}

	public int getHeight(TreeNode head) {

		if (head == null) {
			return 0;
		} else {
			return 1 + Math.max(getHeight(head.left), getHeight(head.right));
		}
	}

	/**
	 * pass head node in list and height of the tree 
	 * 
	 * @param levelNodes
	 * @param level
	 */
	private void printTree(List<TreeNode> levelNodes, int level) {

		List<TreeNode> nodes = new ArrayList<TreeNode>();
		
		//indentation for first node in given level
		printIndentForLevel(level);
		
		for (TreeNode treeNode : levelNodes) {
			
			//print node data
			System.out.print(treeNode == null?" ":treeNode.data);
		
			//spacing between nodes
			printSpacingBetweenNodes(level);
			
			//if its not a leaf node
			if(level>1){
				nodes.add(treeNode == null? null:treeNode.left);
				nodes.add(treeNode == null? null:treeNode.right);
			}
		}
		System.out.println();
		
		if(level>1){		
			printTree(nodes, level-1);
		}
	}

	private void printIndentForLevel(int level){
		for (int i = (int) (Math.pow(2,level-1)); i >0; i--) {
			System.out.print(" ");
		}
	}
	
	private void printSpacingBetweenNodes(int level){
		//spacing between nodes
		for (int i = (int) ((Math.pow(2,level-1))*2)-1; i >0; i--) {
			System.out.print(" ");
		}
	}
	
	public void delete(int data) {
		TreeNode nodeToDelete = search(head, data);
	}


	public TreeNode search(TreeNode head, int data) {
		if (head.data == data) {
			return head;
		}

		if (data < head.data) {
			return search(head.left, data);
		} else {
			return search(head.right, data);
		}
	}
}
