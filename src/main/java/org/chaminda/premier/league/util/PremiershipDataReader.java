/**
 * 
 */
package org.chaminda.premier.league.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.chaminda.premier.league.domain.Team;

/**
 * This class deals with reading records of Premiership data.
 * 
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public class PremiershipDataReader extends AbstractDataReader {

	/**
	 * This operation extracts data specific to Premiership table and returns
	 * team details.
	 * 
	 * @param readLine
	 *            as {@link List} of information read through the file.
	 * @return {@link List} of objects extracted.
	 */
	@Override
	public List<Team> extractData(final List<String> readLines) {

		final List<Team> teams = new ArrayList<Team>();

		if (readLines != null && !readLines.isEmpty()) {

			for (String readLine : readLines) {

				// Reading only the columns starting with numbers.
				if (readLine != null && !readLine.isEmpty()
						&& Character.isDigit(readLine.trim().charAt(Constants.INDEX_ZERO))) {

					final List<String> teamDataList = new ArrayList<String>();

					final StringTokenizer token = new StringTokenizer(readLine, Constants.DELEMETER);
					while (token.hasMoreTokens()) {

						teamDataList.add(token.nextToken());

					}

					final Team team = new Team(Integer.parseInt(teamDataList.get(Constants.INDEX_ZERO).trim()),
							teamDataList.get(Constants.INDEX_TEAM).trim(), Integer.parseInt(teamDataList.get(
									Constants.INDEX_PLAYED).trim()), Integer.parseInt(teamDataList.get(
									Constants.INDEX_WINS).trim()), Integer.parseInt(teamDataList.get(
									Constants.INDEX_LOSSES).trim()), Integer.parseInt(teamDataList.get(
									Constants.INDEX_DRAWS).trim()), Integer.parseInt(teamDataList.get(
									Constants.INDEX_FOR).trim()), Integer.parseInt(teamDataList.get(
									Constants.INDEX_AGAINST).trim()), Integer.parseInt(teamDataList.get(
									Constants.INDEX_TOTAL).trim()));

					teams.add(team);
				}

			}
		}
		return teams;

	}
}
