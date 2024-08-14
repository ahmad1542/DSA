
public class clsDblLinkedList <T> {
	class Node {
		T value;
		Node next;
		Node prev;
		
		Node(T value) {
			this.value = value;
			this.next = null;
			this.prev = null;
		}
		
		
	}
	
	Node head = null;

	void insertAtBeginning(T value) {
		Node newNode = new Node(value);
		
		newNode.next = head;
		newNode.prev = null;
		if (head != null)
			head.prev = newNode;
		head = newNode;
	}

	void insertAtEnd(T value) {
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

	void insertAfter(Node current, T value) {
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

	void deleteNode(T value) {
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

	void deleteFirstNode() {
		if (head == null || head.next == null) {
			return;
		}
		head.value = head.next.value;
		head.next = head.next.next;
	}

	void deleteLastNode() {
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

	Node find(T value) {
		Node current = head;
        while (current != null) {
            if (current.value == value)
                return current;
            current = current.next;
        }
        return null;
	}
	
	void printList() {
		Node temp = head; // Use a temporary variable to traverse the list
        System.out.print("\n\nNULL <--> ");
        while (temp != null) {
            System.out.print(temp.value + " <--> ");
            temp = temp.next;
        }
        System.out.println("NULL");
	}
}
