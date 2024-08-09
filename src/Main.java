import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue <Integer> qNumbers = new LinkedList<>();		
		
		qNumbers.add(10);
		qNumbers.add(20);
		qNumbers.add(30);
		qNumbers.add(40);
		
		System.out.println("Count = " + qNumbers.size());

		while (!qNumbers.isEmpty()) {
			System.out.println(qNumbers.poll());
		}
	}
	
}