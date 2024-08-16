
public class clsMyStack<T> extends clsMyQueue<T> {
	public void push(T item) {
		myList.insertAtBeginning(item);
	}

	public T Top()
	{
		return front();
		
	}

	public T Bottom()
	{
		return back();

	}
}
