package Stuctural.Composite;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

public class EmployeeTree implements TreeSelectionListener{

	public EmployeeTree(Employee topDog) {
	}

	private DefaultMutableTreeNode addNodesRecursive(Employee emp) {
		DefaultMutableTreeNode node = new DefaultMutableTreeNode(emp);

		for (Employee sub : emp.getSubordinates()) {
			node.add(addNodesRecursive(sub));
		}

		return node;
	}

	@Override
	public void valueChanged(TreeSelectionEvent evt) {
		Employee employee = (Employee)((DefaultMutableTreeNode) evt.getPath().getLastPathComponent()).getUserObject();
		
		if(employee != null) {
 		}
	}
}
