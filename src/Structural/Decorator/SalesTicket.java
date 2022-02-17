package Structural.Decorator;

/* @Author Ted Vu
 * 
 * The concrete class that will be wrapped by the decorator
 * 
 * 
 */
public class SalesTicket implements Ticket {

	@Override
	public void printTicket() {
		// TODO Auto-generated method stub
		System.out.println("Ticket Content");
	}

}
