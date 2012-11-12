/**
 * 
 */
package org.chaminda.premier.league.service;

import java.util.Collections;
import java.util.List;

import org.chaminda.premier.league.domain.Team;
import org.chaminda.premier.league.util.Constants;
import org.chaminda.premier.league.util.PremiershipDataReader;

/**
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public class PremiershipServiceImpl implements IPremiershipService {

	private PremiershipDataReader premiershipInputReader;

	public PremiershipServiceImpl() {
		premiershipInputReader = new PremiershipDataReader();
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Team getSmallestDiffBetweenForAndAgainst() {

		final List<Team> teams = (List<Team>) premiershipInputReader.readDataFromFile(Constants.FILE_NAME);

		Team teamWithSmallestDiff = null;

		if (teams != null && !teams.isEmpty()) {

			Collections.sort(teams);
			teamWithSmallestDiff = (Team) teams.get(Constants.INDEX_ZERO);

		}

		return teamWithSmallestDiff;
	}

}
