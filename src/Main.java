import java.util.Vector;

class Node {
	int value;
	Node next;
	Node prev;
	
	Node(int value) {
		this.value = value;
		this.next = null;
		this.prev = null;
	}
}

class Main {
	static Node head;
	
	static int size() {
		int size = 1;
		Node CurrNode = head;
		while (CurrNode.next != null) {
			size++;
			CurrNode = CurrNode.next;
		}
		return size;
	}

	static void insertAtBeginning(Node head, int value) {
		Node newNode = new Node(value);
		
		newNode.next = head;
		if (head != null)
			head.prev = newNode;
		head = newNode;
	}

	static void insertAtEnd(int value) {
		Node newNode = new Node(value);
		newNode.next = null;

		if (head == null) {
			head = newNode;
			return;
		}

		Node lastNode = head;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
		}

		lastNode.next = newNode;
		return;
	}

	static void insertAfter(int value) {
		Node preNode = head;
		if (preNode == null) {
			System.out.println("The previous node cannot be null.");
			return;
		}
		Node newNode = new Node(value);
		newNode.next = preNode.next;
		preNode.next = newNode;
	}

	static void deleteNode(int value) {
		Node current = head, prev = null;

		if (head == null)
			return;

		if (current.value == value) {
			head = current.next;
			return;
		}

		while (current != null && current.value != value) {
			prev = current;
			current = current.next;
		}

		if (current == null)
			return;

		prev.next = current.next;
	}

	static void deleteFirstNode() {
		if (head == null || head.next == null) {
			return;
		}
		head.value = head.next.value;
		head.next = head.next.next;
	}

	static void deleteLastNode() {
		Node current = head, prev = null;

		if (head == null) {
			return;
		}

		if (head.next == null) {
			return;
		}

		while (current.next != null) {
			prev = current;
			current = current.next;
		}

		prev.next = current.next;
	}

	static Node find(int value) {
		while (head != null) {
			if (head.value == value)
				return head;
			head = head.next;
		}
		return null;
	}

	static void printNodeDetails(Node head) {
		
	    if (head.prev != null)
	        System.out.print(head.prev.value);
	    else
	        System.out.print("NULL");

	    System.out.print(" <--> " + head.value + " <--> ");

	    if (head.next != null)
	        System.out.println(head.next.value);
	    else
	        System.out.print("NULL");

	}
	
	static void printListDetails(Node head) {
	    System.out.println();
	    System.out.println();
	    while (head != null) {
	        printNodeDetails(head);
	        head = head.next;
	    }
	}
	
	static void printList(Node head) {
	    System.out.print("NULL <--> ");
	    while (head != null) {
	        System.out.print(head.value + " <--> ");
	        head = head.next;
	    }
	    System.out.print("NULL");
	}

	public static void main(String[] args) {
		Node head = new Node(6);

		insertAtBeginning(head, 5);
		insertAtBeginning(head, 4);
		insertAtBeginning(head, 3);
		insertAtBeginning(head, 2);
		insertAtBeginning(head, 1);

		printList(head);
		//printListDetails(head);
		//printNodeDetails(find(5));
	}
}