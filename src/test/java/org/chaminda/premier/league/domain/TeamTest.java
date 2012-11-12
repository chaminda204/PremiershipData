/**
 * 
 */
package org.chaminda.premier.league.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public class TeamTest {

	/**
	 * @throws java.lang.Exception
	 */
	Team team;

	@Before
	public void setUp() throws Exception {
		team = new Team();
	}

	@Test
	public void setAndGetId() {
		team.setId(1);
		assertEquals("Setting ID returned a wrong value", (Integer) 1, team.getId());
	}

	@Test
	public void setAndGetTeamName() {
		team.setTeamName("Man UTD");
		assertEquals("Setting team name retruned a wrong value", "Man UTD", team.getTeamName());
	}

	@Test
	public void setAndGetPlayedMatches() {
		team.setPlayedMatches(23);
		assertEquals("Setting Played matches returned a wrong value", (Integer) 23, team.getPlayedMatches());
	}

	@Test
	public void setAndGetNoOfWins() {
		team.setNoOfWins(18);
		assertEquals("Setting no of wins returned a wrong value", (Integer) 18, team.getNoOfWins());
	}

	@Test
	public void setAndGetNoOfLosses() {
		team.setNoOfLosses(1);
		assertEquals("Setting no of losses returned a wrong value", (Integer) 1, team.getNoOfLosses());
	}

	@Test
	public void setAnsGetNoOfDraws() {
		team.setNoOfDraws(5);
		assertEquals("Setting no of draws returned a wrong value", (Integer) 5, team.getNoOfDraws());
	}

	@Test
	public void setAndGetAgainstGoals() {
		team.setAgainstGoals(25);
		assertEquals("Setting against goals returned a wrong value", (Integer) 25, team.getAgainstGoals());

	}

	@Test
	public void setAndGetForGoals() {
		team.setForGoals(55);
		assertEquals("Setting for goals returned a wrong value", (Integer) 55, team.getForGoals());
	}

}
