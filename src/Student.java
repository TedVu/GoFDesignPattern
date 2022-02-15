
public class Student implements Comparable {

	private String name;
	private String id;
	private GENDER gender;

	public Student(String name, String id, GENDER gender) {
		this.name = name;
		this.id = id;
		this.gender = gender;
	}
	
	public void register(String id) {
		// A method that handles registration
	}
	
	// This is not a good design to implement Comparable interface 
	// because we put the responsibility of comparing two objects into student class
	// What if we want to compare in different ways ? 
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
