import java.util.ArrayList;

public class NodeMain {
	public static void main(String[] args) {
		Node head = new Node(3);
		Node nodeA = new Node(4);
		Node nodeB = new Node(2);
		Node nodeC = new Node(8);
		Node nodeD = new Node(6);
		Node nodeE = new Node(5);
		
		head.next = nodeA;
		nodeA.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		
		addNodes(head);
		// findNodePos(head, NodeD)
	}
	
	
	// Finde die Position des Nodes 
	static void findNodePos(Node head, Node node) {
		
		Node currentNode = head;
		Node targetNode = node;
		int counter = 1;
		
		while(currentNode.data != targetNode.data) {
			counter++;
			currentNode = currentNode.next;
		}
		
		System.out.println("Position: " + counter);
	}
	
	
	// Addiere alle Nodes innerhalb LinkedList
	static void addNodes(Node head) {
		
		Node current = head;
		int counter = 0;
		
		while(current != null) {
			counter += current.data;
			current = current.next;
		}
		
		System.out.println(counter);
	}
}
