
public class clsDblLinkedList <T> {
	public class Node {
		T value;
		Node next;
		Node prev;
		
		Node(T value) {
			this.value = value;
			this.next = null;
			this.prev = null;
		}
		
		
	}
	
	public Node head = null;
	
	private int size = 0;
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void clear() {
		while (size > 0) {
			deleteFirstNode();
		}
	}

	public void reverse() {
		Node current = head;
		Node temp = null;
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		
		if (temp != null)
			head = temp.prev;
	}
	
	public Node getNode(int index) {
		int counter = 0;
		
		if (index > size - 1 || index < 0) {
			return null;
		}
		
		Node current = head;
		while (current != null || (current.next != null)) {
			if (counter == index)
				break;
			current = current.next;
			counter++;
		}
		
		return current;
	}

	public T getItem(int index) {
		Node itemNode = getNode(index);
		if (itemNode == null)
			return null;
		else
			return itemNode.value;
	}

	public boolean updateItem(int from, T to) {
		Node current = getNode(from);
		if (current != null) {
			current.value = to;
			return true;
		} else 
			return false; 
	}
	
	public void insertAtBeginning(T value) {
		Node newNode = new Node(value);
		
		newNode.next = head;
		newNode.prev = null;
		if (head != null)
			head.prev = newNode;
		head = newNode;
		size++;
	}

	public void insertAtEnd(T value) {
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
		size++;
	}

	public void insertAfter(Node current, T value) {
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
		size++;
	}

	public boolean insertAfter(int index, T value) {
		Node itemNode = getNode(index);
		if (itemNode != null) {
			insertAfter(itemNode, value);
			return true;
		} else
			return false;
	}
	
	public void deleteNode(T value) {
		Node current = head, prev = null;

		if (head == null)
			return;

		if (current.value == value) {
			head.value = current.next.value;
			head.next = current.next.next;
			size--;
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
		size--;
	}

	public void deleteFirstNode() {
		if (head == null) {
			return;
		}
		
		head = head.next;
		
		if (head != null)
			head.prev = null;
		size--;
	}

	public void deleteLastNode() {
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
		size--;
	}

	public Node find(T value) {
		Node current = head;
        while (current != null) {
            if (current.value == value)
                return current;
            current = current.next;
        }
        return null;
	}
	
	public void printList() {

		Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
	}

}
