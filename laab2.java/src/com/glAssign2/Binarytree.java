package com.glAssign2;

import lab2.java.binarytree.Node;

public class Binarytree {
	class Node{
		int key;
		Node left ,right;
		public Node(int item) {
		
		left = right = null;
		
		node root;
	    public Node(int key,Node left,Node right);
			super();
			this.key = key;
			this.left = left;
			this.right = right;
		}
		BinarySerchTree(){
			root = Null;
					
		}
	    void insert (intkey) {
	    	root=insrt(root,key);
	    	Node insertNode ( Node root,int key) {
	    	
	    	if (root == null) {
	    		root = new Node(key);
	    		return root;
	    	
	    	}
	    	if (key < root.key);
	    	root.left = insertNode(root.left, key);
	    	else if (key > root.key);
	    	root.right = insertNode(root.right, key);
	    	return root;}
		
}
