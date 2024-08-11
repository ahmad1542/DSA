class Node {
	int value;
	Node next;
	
	Node (int value) {
		this.value = value;
		this.next = null;
	}
}

class Main {
	static int size(Node head) {
	    int size = 1;
	    Node CurrNode = head;
	    while(CurrNode.next != null) {
	    	size++;     
	        CurrNode = CurrNode.next;
	    }
	    return size;
	}

	static void insertAtBeginning(Node head, int value) {
		Node newNode = new Node(value);  // Use the constructor to set the value
	    newNode.next = head;
	    head = newNode;
	}
	
	static void insertAtEnd(Node head, int value) {
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
	
	static void insertAfter(Node preNode, int value) {
		if (preNode == null) {
			System.out.println("The previous node cannot be null.");
			return;
		}
		Node newNode = new Node(value);
		newNode.next = preNode.next;
		preNode.next = newNode;
	}
	
	static Node deleteNode(Node head, int value) {
		Node current = head, prev = null;
		
        if (head == null) 
            return head; 
		  
        if (current.value == value) { 
            head = current.next;
            return head; 
        } 
  
        while (current != null && current.value != value) { 
            prev = current; 
            current = current.next; 
        } 
  
        if (current == null) 
            return head; 
  
        prev.next = current.next;
        return head;
	}
	
	static Node deleteFirstNode(Node head) {
		if (head == null) {
			return null;
		}
        return head.next;
	}

	static Node deleteLastNode(Node head) {
		Node current = head, prev = null;
		
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return null;
        }
        
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
  
        prev.next = current.next;
        return head;
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
			System.out.print(head.value + " ");
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		Node head = new Node(0);
		
		insertAtEnd(head, 1);
		head = deleteFirstNode(head);
		insertAtEnd(head, 2);
		insertAtEnd(head, 3);
		insertAtEnd(head, 4);
		insertAtEnd(head, 5);
		
		head = deleteLastNode(head);

		printList(head);
		
	}
}