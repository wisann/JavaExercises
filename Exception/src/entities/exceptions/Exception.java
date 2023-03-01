package entities.exceptions;
/**
 * this class represents the exceptions of all classes
 * @author wisan
 *
 */
public class Exception extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public Exception (String msg) {
		super(msg); // this string brings the messages of the exceptions
		
	}

}
