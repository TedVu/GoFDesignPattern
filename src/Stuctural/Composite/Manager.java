package Stuctural.Composite;

import java.util.ArrayList;
import java.util.List;

/* @Author Ted
 * 
 * Please refer to the diagram for composite design pattern, manager here is 
 * the Composite 
 * 
 */
public class Manager extends SimpleEmployee {
	private List<Employee> subordinates = new ArrayList<>();

	public Manager(String name, long salary) {
		super(name, salary);
	}

	public void add(Employee e) {
		subordinates.add(e);
	}

	public void remove(Employee e) {
		subordinates.remove(e);
	}

	public long getSalary() {
		long sum = salary;
		for (Employee employee : subordinates) {
			sum += employee.getSalary();
		}

		return sum;
	}
}
