/**
 * 
 */
package org.chaminda.premier.league.domain;

/**
 * All the domain objects should extend this class and the program supports only
 * the domain objects which extends this class.
 * 
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public abstract class AbstractEntity {

	/**
	 * Holds the ID value.
	 */
	private Integer id;

	/**
	 * Empty constructor.
	 */
	public AbstractEntity() {

	}

	/**
	 * Constructor with the ID.
	 * 
	 * @param id
	 *            to set the IDValue.
	 */
	public AbstractEntity(final Integer id) {
		this.id = id;
	}

	/**
	 * Getter method for id
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter method for id
	 * 
	 * @param id
	 *            for setting id value
	 */
	public void setId(final Integer id) {
		this.id = id;
	}

}
