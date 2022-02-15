package Stuctural.Composite;

import java.util.List;

/*@Author Ted Vu
 * 
 * This is the component in class diagram for composite design pattern
 * 
 */
public interface Employee {
	public abstract long getSalary();

	public abstract String getName();

	public abstract List<Employee> getSubordinates();

}
