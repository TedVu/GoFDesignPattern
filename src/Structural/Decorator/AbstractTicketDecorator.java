package Structural.Decorator;

/*@Author Ted Vu
 * 
 * This is the abstract class that decorator has to comply to
 * 
 * 
 */
public class AbstractTicketDecorator implements Ticket {

	private Ticket ticket;

	public AbstractTicketDecorator(Ticket ticket) {
		if (ticket == null) {
			throw new IllegalArgumentException("Not supported operation");
		}

		this.ticket = ticket;
	}

	@Override
	public void printTicket() {
		// TODO Auto-generated method stub
		ticket.printTicket();
	}

}
