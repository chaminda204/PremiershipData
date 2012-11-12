/**
 * 
 */
package org.chaminda.premier.league.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.chaminda.premier.league.domain.AbstractEntity;
import org.chaminda.premier.league.domain.Team;
import org.chaminda.premier.league.util.PremiershipDataReader;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

/**
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 2, 2012
 */
public class PremiershipServiceTest {

	//@InjectMocks
	private IPremiershipService premiershipService;

	//@Mock
	//private PremiershipDataReader reader;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		premiershipService = new PremiershipServiceImpl();
		//initMocks(this);
	}

	//@Test
	public void getSmallestDiffBetweenForAndAgainstTest() {

		// Given
		//Mockito.given(reader.readFileData("test.dtd")).willReturn(getPremiershipTeamsForTest());
		//Mockito.doReturn(getPremiershipTeamsForTest()).when(reader.readFileData("test.dtd"));
	//	Mockito.when(reader.readFileData("test.dtd")).thenReturn(getPremiershipTeamsForTest());
		//Mockito.when(reader.readFileData("test.dtd")).thenReturn(getPremiershipTeamsForTest());

		// When
		Team team = premiershipService.getSmallestDiffBetweenForAndAgainst();

		// Then
		assertEquals("Arsenal", team.getTeamName());

	}

	private List<AbstractEntity> getPremiershipTeamsForTest() {

		List<AbstractEntity> teams = new ArrayList<AbstractEntity>();

		Team manUtd = new Team(1, "Man Utd", 24, 20, 1, 3, 40, 12, 55);
		teams.add(manUtd);

		Team chelsea = new Team(2, "Chelsea", 24, 14, 6, 4, 23, 15, 40);
		teams.add(chelsea);

		Team liverpool = new Team(1, "Liverpool", 24, 15, 4, 6, 40, 12, 48);
		teams.add(liverpool);

		Team arsenal = new Team(2, "Arsenal", 24, 19, 4, 1, 23, 20, 50);
		teams.add(arsenal);
		return teams;

	}

	@Test
	public void getSmallestDiffBetweenForAndAgainst() {
		Team team = premiershipService.getSmallestDiffBetweenForAndAgainst();
		Assert.assertEquals("", "Aston_Villa", team.getTeamName());
	}

}
