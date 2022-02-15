package Stuctural.Composite;

import javax.swing.JFrame;

public class TestEmployeeTree extends JFrame {

	public TestEmployeeTree() {
		super("Employee tree");
//		add(new EmployeeTree(createEmployeeComposite()));
		setBounds(100, 100, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Factory method
	private Employee createEmployeeComposite() {
		Manager boss = new Manager("CEO", 200000), marketVP = new Manager("Marketing VP", 100000),
				prodVP = new Manager("Production VP", 100000), salesMgr = new Manager("Sales Mgr", 50000),
				advMgr = new Manager("Advt Mgr", 50000), prodMgr = new Manager("Prod Mgr", 40000),
				shipMgr = new Manager("Ship Mgr", 35000);

		boss.add(marketVP);
		boss.add(prodVP);
		marketVP.add(advMgr);
		marketVP.add(salesMgr);

		prodVP.add(prodMgr);
		prodVP.add(shipMgr);

		populateEmployee(salesMgr, 5, "Sales", 30000L, 10000L);
		populateEmployee(prodMgr, 4, "Manuf", 25000L, 5000L);
		populateEmployee(salesMgr, 3, "ShipClrk", 20000L, 5000L);

		advMgr.add(new SimpleEmployee("Secy", 20000));

		return boss;
	}

	private void populateEmployee(Manager manager, int numEmployees, String employeeType, long baseSalary,
			long multiplier) {
		for (int i = 1; i <= numEmployees; ++i) {
			manager.add(new SimpleEmployee(String.format("%s %d", employeeType, i),
					baseSalary + (long) (Math.random() - 0.5) * multiplier));
		}

	}

	public static void main(String[] args) {
		new TestEmployeeTree();
	}

}
