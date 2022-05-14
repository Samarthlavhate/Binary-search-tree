package com.jap.textanalyzer;
public class BinarySearchTree {

	// Declare a root node
	 Node root;

	// This method takes the node and the word to be searched in the tree
	public Node search(Node node, String oneWord) {

		if(node!=null) {
			if(node.word.getWord().equalsIgnoreCase(oneWord)) {
				return node;
			} else if (node.word.getWord().compareTo(oneWord) > 0) {
				search(node.left, oneWord);
			} else {
				search(node.right, oneWord);
			}
		}
			return null;
	}


	// inserting the Word data in a new node in the binary search tree
	// in alphabetical order of words
	public Node insert(Node node, Word word){
			Node nd = new Node(word);
			if (node == null) {
				node = nd;
			} else {
				if (node.word.getWord().compareTo(word.getWord()) > 0){
					node.left = insert(node.left, word);}

				else if (node.word.getWord().compareTo(word.getWord()) < 0){
					node.right = insert(node.right, word);}
			}

			return node;

		}
    // This method takes the start node and returns the count of all nodes in the tree
	public int getNumberOfNodes(Node root) {
		 if(root==null){
		  return 0;
	  }
	  else {
		  System.out.print((1+getNumberOfNodes(root.left)+getNumberOfNodes(root.right))
);
		return (1+getNumberOfNodes(root.left)+getNumberOfNodes(root.right));

	  }
	}
	// This method take the start node and the traversal order
	// and prints the nodes of the tree in the order specified
	public void showTree(Node node, String traversalOrder)
	{
       preOrder(node);
	}
	//Method for inorder traversal
	private void inOrder(Node node) {
		if (node != null) {
			inOrder(node.left);
			System.out.print(node.word);
			inOrder(node.right);
		}
	}
	//Method for preorder traversal
	private void preOrder(Node node) {
          if(node!=null) {
			  System.out.println(node.word);
			  preOrder(node.left);
			  preOrder(node.right);
		  }
	}
	//Method for postorder traversal
	private void postOrder(Node node) {
       if(node!=null){
		   postOrder(node.left);
		   postOrder(node.right);
		   System.out.println(node.word);

	}}


}
