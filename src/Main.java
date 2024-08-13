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
	static int size(Node head) {
		int size = 1;
		Node CurrNode = head;
		while (CurrNode.next != null) {
			size++;
			CurrNode = CurrNode.next;
		}
		return size;
	}

	static Node insertAtBeginning(Node head, int value) {
		Node newNode = new Node(value);
		
		newNode.next = head;
		if (head != null)
			head.prev = newNode;
		return newNode;
	}

	static void insertAtEnd(Node head, int value) {
		Node newNode = new Node(value);
		newNode.next = null;

		if (head == null) {
			newNode.prev = null;
			head = newNode;
		} else {
			
			Node lastNode = head;
			while (lastNode.next != null) {
				lastNode = lastNode.next;
			}
			lastNode.next = newNode;
			newNode.prev = lastNode;
		}
	}

	static void insertAfter(Node current, int value) {
		if (current == null) {
			System.out.println("The previous node cannot be null.");
			return;
		}
		Node newNode = new Node(value);
		newNode.next = current.next;
		newNode.prev = current;
		if (current.next != null)
			current.next.prev = newNode;
		current.next = newNode;
	}

	static void deleteNode(Node head, int value) {
		Node current = head, prev = null;

		if (head == null)
			return;

		if (current.value == value) {
			head.value = current.next.value;
			head.next = current.next.next;
			return;
		}

		while (current != null && current.value != value) {
			prev = current;
			current = current.next;
		}

		if (current == null)
			return;
		
		prev.next = current.next;
		if (current.next != null)
			current.next.prev = prev;
	}

	static void deleteFirstNode(Node head) {
		if (head == null || head.next == null) {
			return;
		}
		head.value = head.next.value;
		head.next = head.next.next;
	}

	static void deleteLastNode(Node head) {
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

	static Node find(Node head, int value) {
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
	    System.out.print("\n\nNULL <--> ");
	    while (head != null) {
	        System.out.print(head.value + " <--> ");
	        head = head.next;
	    }
	    System.out.print("NULL");
	}

	public static void main(String[] args) {
		Node head = new Node(6);
		
		head = insertAtBeginning(head, 5);
		head = insertAtBeginning(head, 4);
		head = insertAtBeginning(head, 3);
		head = insertAtBeginning(head, 2);
		head = insertAtBeginning(head, 1);
		insertAtEnd(head, 7);
		deleteLastNode(head);

		printList(head);
		printListDetails(head);
		//printNodeDetails(find(5));
	}
}