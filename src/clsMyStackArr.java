
public class clsMyStackArr<T> extends clsMyQueue<T> {
	public void push(T item) {
		myList.insertAtBeginning(item);
	}
	
	public T top() {
		return front();
	}

	public T bottom() {
		return back();
	}
}
