
public class clsMyQueueArr<T> {
	protected clsDynamicArray<T> myDynamicArray = new clsDynamicArray<T>();
	
	public void push(T newItem) {
		myDynamicArray.insertAtEnd(newItem);
	}
	
	public void pop() {
		myDynamicArray.deleteFirstItem();
	}
	
	public int size() {
		return myDynamicArray.size();
	}
	
	public T front() {
		return myDynamicArray.getItem(0);
	}
	
	public T back() {
		return myDynamicArray.getItem(size() - 1);
	}
	
	public T getItem(int index) {
		return myDynamicArray.getItem(index);
	}
	
	public void reverse() {
		myDynamicArray.reverse();
	}
	
	public void updateItem(int index, T item) {
		myDynamicArray.setItem(index, item);
	}
	
	public void insertAfter(int index, T item) {
		myDynamicArray.insertAfter(index, item);
	}
	
	public void insertAtFront(T item) {
		myDynamicArray.insertAtBeginning(item);
	}
	
	public void insertAtBack(T item) {
		myDynamicArray.insertAtEnd(item);
	}
	
	public void clear() {
		myDynamicArray.clear();
	}

	public void print() {
		myDynamicArray.printList();
	}
	
}
