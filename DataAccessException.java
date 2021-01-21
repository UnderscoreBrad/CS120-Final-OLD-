package finalexam;

public class DataAccessException extends RuntimeException {

	/**
	 * Generated by Eclipse, which uses the serialver.exe tool
	 */
	private static final long serialVersionUID = 1014906548362472885L;

	/**
	 * No-argument constructor needed for serialization
	 */
	public DataAccessException() {
		super();
	}

	/**
	 * Preferred constructor that sets the inherited message field
	 * of the exception object
	 * @param arg0 message passed by the exception that was thrown
	 */
	public DataAccessException(String arg0) {
		super(arg0);
	}
}
