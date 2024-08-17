import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class clsQueueLine {
	private Queue<String> queue = new LinkedList<String>();
	private List<String> tickets = new ArrayList<String>();
	private int avgTime;
	private String prefix;
	private int prefixCounter = 0;
	private int servedClients = 0;
	private int waitingClients = 0;

	public clsQueueLine(String prefix, int avgTime) {
		this.prefix = prefix;
		this.avgTime = avgTime;
	}
	
	public void issueTicket() {
		queue.add(prefix + (prefixCounter + 1));
		prefixCounter++;
		waitingClients++;
	}
	
	public void printInfo() {
		System.out.print("\n\t\t\t _________________________\n");
		System.out.print("\n\t\t\t\tQueue Info");
		System.out.print("\n\t\t\t _________________________\n");
		System.out.print("\n\t\t\t    Prefix   = " + prefix);
		System.out.print("\n\t\t\t    Total Tickets   = " + prefixCounter);
		System.out.print("\n\t\t\t    Served Clients  = " + servedClients);
		System.out.print("\n\t\t\t    Wating Clients  = " + waitingClients);
		System.out.println("\n\t\t\t _________________________\n");
	}

	public void printTicketsLineRTL() {
		String temp = queue.poll();
		tickets.add(temp);
		System.out.print("\n\t\tTickets: " + temp);
		while (!queue.isEmpty()) {
			temp = queue.poll();
			tickets.add(temp);
			System.out.print("  <--  " + temp);
		}
	}

	public void printTicketsLineLTR() {
		System.out.print("\n\t\tTickets: " + tickets.getLast());
		for (int i = 1; i < tickets.size(); i++) {
			System.out.print("  -->  " + tickets.get(prefixCounter - i - 1));
		}
		System.out.println();
		System.out.println();	
		
	}

	public void printAllTickets() {
		LocalDate currentDate = LocalDate.now(); 
		LocalTime currentTime = LocalTime.now(); 
		System.out.print("\n\n\t\t\t       ---Tickets---");
		for (int i = 0; i < tickets.size(); i++) {
			System.out.print("\n\t\t\t  _______________________\n");
			System.out.print("\n\t\t\t\t    " + tickets.get(i));
			System.out.print("\n\n\t\t\t    " + currentDate + " - " + currentTime);
			System.out.print("\n\t\t\t    Wating Clients = " + waitingClients);
			System.out.print("\n\t\t\t      Serve Time In \n\t\t\t       " + (avgTime * i));
			System.out.print("\n\t\t\t  _______________________\n");
			
		}
	}

	public void serveNextClient() {
		tickets.removeFirst();
		waitingClients--;
		servedClients++;
	}
	
}
