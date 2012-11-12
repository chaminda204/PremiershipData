/**
 * 
 */
package org.chaminda.premier.league.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.chaminda.premier.league.domain.AbstractEntity;
import org.chaminda.premier.league.exception.DataFileReadingException;

/**
 * This class reads data for a given file and delegates the specific behavior to
 * the extending class to be implemented.
 * 
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public abstract class AbstractDataReader {

	/**
	 * This operation reads the data from the given file and
	 * 
	 * @param fileName
	 *            as the fully qualified path name of the file.
	 * @return {@link List} of read information.
	 */
	@SuppressWarnings("unchecked")
	public List<? extends AbstractEntity> readDataFromFile(final String fileName) {

		final List<String> lines = new ArrayList<String>();
		List<AbstractEntity> teams = null;

		final InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName);

		if (inputStream != null) {
			
			final InputStreamReader isReader = new InputStreamReader(inputStream);
			final BufferedReader reader = new BufferedReader(isReader);
			try {

				// Reading the file line by line
				String line;
				while ((line = reader.readLine()) != null) {
					lines.add(line);
				}

				if (!lines.isEmpty()) {
					teams = (List<AbstractEntity>) extractData(lines);
				}

			} catch (IOException e) {

				throw new DataFileReadingException("Error reading the spcified file");
			} finally {

				closeSafely(reader);
			}

		} else {
			throw new DataFileReadingException("The file cannot be found");
		}

		return teams;
	}

	private void closeSafely(final BufferedReader reader) {

		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {

				throw new DataFileReadingException("Error closing the buffered reader");
			}
		}
	}

	/**
	 * Extending classes should implement this operation.
	 * 
	 * @param readLine
	 *            as {@link List} of information read through the file.
	 * @return {@link List} of objects extracted.
	 */
	protected abstract List<? extends AbstractEntity> extractData(final List<String> readLine);

}
