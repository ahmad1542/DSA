class Main {
	public static void main(String[] args) {
		clsDynamicArray <Integer>  myDynamicArray = new clsDynamicArray<Integer>(5);
		
	    myDynamicArray.setItem(0, 10);
	    myDynamicArray.setItem(1, 20);
	    myDynamicArray.setItem(2, 30);
	    myDynamicArray.setItem(3, 40);
	    myDynamicArray.setItem(4, 50);
	    
	    System.out.print("\nIs Empty?  " + myDynamicArray.isEmpty());
	    System.out.print("\nArray Size: " + myDynamicArray.size() + "\n");
	    System.out.print("\nArray Items: \n");

	    myDynamicArray.printList();

	    int index = myDynamicArray.find(30);
	    if (index ==-1)
	        System.out.print("\nItem was not Found :-(\n ");
	    else
	        System.out.print("\n30 is found at index : " + index);
	    
	    myDynamicArray.deleteItem(30);
	    System.out.print("\n\nArray Items after deleting 30:");
	    System.out.print("\nArray Size: " + myDynamicArray.size() + "\n");
	    myDynamicArray.printList();
	    
	}
}