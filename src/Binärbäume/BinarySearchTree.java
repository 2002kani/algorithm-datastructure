package Binärbäume;

public class BinarySearchTree {

	Node root;
	
	public void insert(Node node) {
		root = insertHelper(root, node);
	}
	
	private Node insertHelper(Node root, Node node) {
		int data = node.data;
		
		if(root == null) {
			
		}
		
		return null;
	}
	
	public void display() {
		
	}
	
	private void displayHelper(Node root) {
		
	}
	
	public boolean search(int data) {
		
	}
	
	private boolean searchHelper(Node root, int data) {
		return false; // placeholder
	}
	
	public void remove(int data) {
		
	}
	
	public Node removeHelper(Node root, int data) {
		return null;
	}
}
