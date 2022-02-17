package Structural.Decorator;

/*
 * @Author Ted Vu
 * 
 * Footer Decorator
 * 
 * 
 */
public class FooterTicket extends AbstractTicketDecorator {

	public FooterTicket(Ticket ticket) {
		super(ticket);
	}

	@Override
	public void printTicket() {
		super.printTicket();
		System.out.println("This is the footer");
	}

}
