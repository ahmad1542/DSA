
class Node {
	int value;
	Node next;
	
	Node (int value) {
		this.value = value;
		this.next = null;
	}
}

class Main {
	static void insertAtBeginning(Node head, int value) {
		Node newNode = new Node(value);  // Use the constructor to set the value
	    newNode.next = head.next;
	    head.next = newNode;
	}
	
	static void insertAfter(Node preNode, int value) {
		if (preNode == null) {
			System.out.println("The previous node cannot be null.");
			return;
		}
		Node newNode = new Node(value);
		newNode.next = preNode.next;
		preNode.next = newNode;
	}
	
	static Node find(Node head, int value) {
		while (head != null) {
			if (head.value == value) 
				return head;
			head = head.next;
		}
		return null;
	}
	
	static void printList(Node head) {
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(6);
		
		insertAtBeginning(head, 1);
		insertAtBeginning(head, 2);
		insertAtBeginning(head, 3);
		insertAtBeginning(head, 4);
		
		Node n1 = find(head, 6);
		insertAfter(n1, 5);
		
		printList(head);
		
		if (n1 != null) {
			System.out.println("\nNode found :)");
		} else
			System.err.println("\nNode is not found :(");
	
		
	}
}