/**
 * 
 */
package org.chaminda.premier.league.exception;

/**
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public class DataFileReadingException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4766005828583347510L;

	/**
	 * empty constructor.
	 */
	public DataFileReadingException() {

	}

	/**
	 * constructor with error message.
	 * 
	 * @param message
	 *            -Error description of the exception.
	 */
	public DataFileReadingException(final String message) {
		super(message);
	}

	/**
	 * Constructor with error description and cause.
	 * 
	 * @param message
	 *            -Error description of the exception.
	 * @param cause
	 *            -Exception that caused the issue.
	 */
	public DataFileReadingException(final String message, final Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor with error description and cause.
	 * 
	 * @param cause
	 *            -Exception that caused the issue.
	 */
	public DataFileReadingException(final Throwable cause) {
		super(cause);
	}

}
