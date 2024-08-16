
public class clsMyQueue<T> {
	protected clsDblLinkedList<T> myList = new clsDblLinkedList<T>();

	public void push(T value) {
		myList.insertAtEnd(value);
	}
	
	public void print() {
		myList.printList();
	}
	
	public int size() {
		return myList.size();
	}
	
	public T front() {
		return myList.getItem(0);
	}
	
	public T back() {
		return myList.getItem(size() - 1);
	}
	
	public void pop() {
		myList.deleteFirstNode();
	}
	
	public T getItem(int index) {
		return myList.getItem(index);
	}
	
	public void reverse() {
		myList.reverse();
	}
	
	public boolean updateItem(int from, T to) {
		return myList.updateItem(from, to);
	}
	
	public boolean insertAfter(int index, T value) {
		return myList.insertAfter(index, value);
	}
	
	public void insertAtFront(T value) {
		myList.insertAtBeginning(value);
	}
	
	public void insertAtBack(T value) {
		myList.insertAtEnd(value);
	}
	
	public void clear() {
		myList.clear();
	}
	
}
