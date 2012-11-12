/**
 * 
 */
package org.chaminda.premier.league.util;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.MockitoAnnotations.initMocks;

import java.util.List;
import java.util.Scanner;

import org.chaminda.premier.league.domain.Team;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

/**
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 2, 2012
 */
public class PremiershipInputReaderTest {

	@InjectMocks
	PremiershipDataReader premiershipInputReader;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		premiershipInputReader = new PremiershipDataReader();
		initMocks(this);
	}

	//@Test
	public void test() {
		
		Scanner mockedScanner = mock(Scanner.class);

		// Given

		given(mockedScanner.nextLine()).willReturn(getNextLine());

		// When
		List<Team> teams = (List<Team>) premiershipInputReader.readDataFromFile("test.tt");
		
		//Then
		Assert.assertEquals("Manchester_U", teams.get(0).getTeamName());

	}

	private String getNextLine() {
		return "3. Manchester_U    38    24   5   9    87  -  45    77";
	}

}
