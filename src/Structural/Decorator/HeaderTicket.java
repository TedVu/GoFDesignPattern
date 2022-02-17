package Structural.Decorator;

/*
 * @Author Ted Vu
 * 
 * Header Decorator
 * 
 * 
 */
public class HeaderTicket extends AbstractTicketDecorator {

	public HeaderTicket(Ticket ticket) {
		super(ticket);
	}

	@Override
	public void printTicket() {
		System.out.println("This is the header");
		super.printTicket();
	}

}
