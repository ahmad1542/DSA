
public class clsDynamicArray<T> {
	
	private int size;
	public T[] originalArray;
	
	@SuppressWarnings("unchecked")
	public clsDynamicArray(int size) {
		if (size < 0)
			size = 0;
		this.size = size;
		originalArray = (T[]) new Object[size];
	}

	public clsDynamicArray() {
		this(0);
	}
	
	public boolean setItem(int index, T value) {
		if (index < 0 || index >= size)
			return false;
		
		originalArray[index] = value;
		return true;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	public void printList() {
		for (int i = 0; i < size; i++) {
				System.out.print(originalArray[i] + " ");
		}
		System.out.println();
	}

	public void resize(int newSize) {
	    if (newSize < 0) 
	        newSize = 0;
	    
	    if (newSize < size)
	    	size = newSize;
	    
	    @SuppressWarnings("unchecked")
	    T[] tempArray = (T[]) new Object[newSize];
	    
	    for (int i = 0; i < size; i++) {
	        tempArray[i] = originalArray[i];
	    }
	    
	    this.size = newSize;
	    originalArray = tempArray;
	}

	public T getItem(int index) {
		return originalArray[index];
	}
	
	public void reverse() {
		int n = originalArray.length;
		for (int i = 0; i < n / 2; i++) {
			T temp = originalArray[i];
			originalArray[i] = originalArray[n - (i+1)];
			originalArray[n - (i+1)] = temp;
		}
	}

	@SuppressWarnings("unchecked")
	public void clear() {
		size = 0;
		originalArray = (T[])new Object[0];
	}

	public boolean deleteItemAt(int index) {
		if (index >= size || index < 0)
			return false;
		
		size--;
		
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[])new Object[size];
		
		for (int i = 0; i < index; i++) {
			tempArray[i] = originalArray[i];
		}
		
		for (int i = index + 1; i < size + 1; i++) {
			tempArray[i - 1] = originalArray[i];
		}

		originalArray = tempArray;
		return true;
	}
	
	public void deleteFirstItem() {
		deleteItemAt(0);
	}
	
	public void deleteLastItem() {
		deleteItemAt(size - 1);
	}

	public int find(T item) {
		for (int i = 0; i < originalArray.length; i++) {
			if (originalArray[i] == item)
				return i;
		}
		return -1;
	}
	
	public boolean deleteItem(T item) {
		int index = find(item);
		
		if (index == -1)
			return false;
		
		return deleteItemAt(index);
	}

	public boolean insertAt(int index, T newItem) {
		if (index > size || index < 0)
			return false;
		size++;
		
		@SuppressWarnings("unchecked")
		T[] tempArray = (T[])new Object[size];
		for (int i = 0; i < index; i++) {
			tempArray[i] = originalArray[i];
		}
		tempArray[index] = newItem;
		for (int i = index + 1; i < size; i++) {
			tempArray[i] = originalArray[i - 1];
		}
		originalArray = tempArray;
		return true;
	}

	public void insertAtBeginning(T newItem) {
		insertAt(0, newItem);
	}

	public boolean insertBefore(int index, T newItem) {
        if (index < 1)
            return insertAt(0, newItem);
        else
            return insertAt(index, newItem);
	}
	
	public boolean insertAfter(int index, T newItem) {
        if (index >= size)
            return insertAt(size - 1, newItem);
        else
            return insertAt(index + 1, newItem);
	}
	
	public void insertAtEnd(T newItem) {
		insertAt(size, newItem);
	}
	
}
