package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author David Brown
 * @version 2022-02-25
 */
public class IA extends Student {
	protected String id = null;
	private String course;
	/**
	 * Contructor for IA
	 */
	public IA(String lastName, String firstName, String id, String course) {
		super(lastName, firstName, id);
		this.course = course;
	}
	/**
	 * Getter for IA
	 */
	public String getCourse() {
		return this.course;
	}
	@Override
	public String toString() {
		return (super.toString()+'\n'+"Course:"+this.course);
	}
}
