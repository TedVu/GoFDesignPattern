package Structural.Decorator;

public class Driver {

	public static void main(String[] args) {
		Ticket ticket = new SalesTicket();

		ticket = new HeaderTicket(new FooterTicket(ticket));

		ticket.printTicket();
	}
}
