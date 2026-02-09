package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author Muqadas Nazif 
 * @version 2022-02-25
 */
public class CAS extends Professor {
	protected String id = null;
	private String term;
	/**
	 * Contructor for CAS
	 */
	public CAS(String lastName, String firstName, String department, String term) {
		super(lastName, firstName, department);
		this.term = term;
	}
	/**
	 * Getter for CAS
	 * @return
	 */
	public String getTerm() {
		return this.term;
	}
	@Override
	public String toString() {
		return (super.toString()+'\n'+"Term:"+this.term);
	}
	

}
