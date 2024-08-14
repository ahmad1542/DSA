class Main {
	public static void main(String[] args) {
		clsDblLinkedList <Integer> myDblLinkedList = new clsDblLinkedList<Integer>();
		myDblLinkedList.insertAtBeginning(5);
		myDblLinkedList.insertAtBeginning(4);
		myDblLinkedList.insertAtBeginning(3);
		myDblLinkedList.insertAtBeginning(2);
		myDblLinkedList.insertAtBeginning(1);
		
		System.out.println("\nLinked List Content:");
		myDblLinkedList.printList();
		
		clsDblLinkedList<Integer>.Node n1 = myDblLinkedList.find(2);
		
		if (n1 != null) {
			System.out.println("\nNode with value " + n1.value + " is found :)");
		} else {
			System.out.println("\nNode is not found :(");
		}
		
		myDblLinkedList.insertAfter(n1, 500);
		System.out.println("\nAfter inserting 500 after 2: ");
		myDblLinkedList.printList();

		myDblLinkedList.insertAtEnd(700);
		System.out.println("\nAfter inserting 700 at end: ");
		myDblLinkedList.printList();

		clsDblLinkedList<Integer>.Node n2 = myDblLinkedList.find(4);
		myDblLinkedList.deleteNode(n2.value);
		System.out.println("\nAfter deleting node 4: ");
		myDblLinkedList.printList();
		
		myDblLinkedList.deleteFirstNode();
		System.out.println("\nAfter after deleting first node: ");
		myDblLinkedList.printList();
		
		myDblLinkedList.deleteLastNode();
		System.out.println("\nAfter after deleting last node: ");
		myDblLinkedList.printList();
	}
}