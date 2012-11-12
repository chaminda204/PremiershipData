/**
 * 
 */
package org.chaminda.premier.league.service;

import org.chaminda.premier.league.domain.Team;

/**
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public interface IPremiershipService {

	/**
	 * This operation returns the smallest difference between for and against
	 * goals.
	 * 
	 * @return {@link Team} which has smallest difference between for and
	 *         against goals .
	 */
	Team getSmallestDiffBetweenForAndAgainst();
}
