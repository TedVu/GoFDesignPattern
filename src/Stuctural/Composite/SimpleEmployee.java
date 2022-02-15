package Stuctural.Composite;

import java.util.ArrayList;
import java.util.List;

/*@Author Ted Vu
 * 
 * This is the leaf in composite design pattern diagram
 * 
 */
public class SimpleEmployee implements Employee {

	private static List<Employee> noSubordinates = new ArrayList<Employee>();
	private String name;
	protected long salary;

	public SimpleEmployee(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	@Override
	public long getSalary() {
		return salary;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public List<Employee> getSubordinates() {
		return noSubordinates;
	}
}
