class Main {
	public static void main(String[] args) {
		clsQueueLine payBillsQueue = new clsQueueLine("A0", 10);
	    clsQueueLine subscriptionsQueue = new clsQueueLine("B0", 5);
	   

	    payBillsQueue.issueTicket();
	    payBillsQueue.issueTicket();
	    payBillsQueue.issueTicket();
	    payBillsQueue.issueTicket();
	    payBillsQueue.issueTicket();

	    System.out.print("\nPay Bills Queue Info:\n");
	    payBillsQueue.printInfo();

	    payBillsQueue.printTicketsLineRTL();
	    payBillsQueue.printTicketsLineLTR();



	    payBillsQueue.printAllTickets();
	 
	    payBillsQueue.serveNextClient();
	    System.out.print("\nPay Bills Queue After Serving One client\n");
	    payBillsQueue.printInfo();

	    System.out.print("\nSubscriptions Queue Info:\n");

	    subscriptionsQueue.issueTicket();
	    subscriptionsQueue.issueTicket();
	    subscriptionsQueue.issueTicket();
	   
	  
	    subscriptionsQueue.printInfo();

	    subscriptionsQueue.printTicketsLineRTL();
	    subscriptionsQueue.printTicketsLineLTR();
	 
	    subscriptionsQueue.printAllTickets();
	    
	    subscriptionsQueue.serveNextClient();
	    System.out.print("\nSubscriptions Queue After Serving One client\n");
	    subscriptionsQueue.printInfo();
	    
	    subscriptionsQueue.printAllTickets();
	    
	}
}