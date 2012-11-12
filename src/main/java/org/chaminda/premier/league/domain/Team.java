/**
 * 
 */
package org.chaminda.premier.league.domain;

/**
 * This class contains the Team data.
 * 
 * @author chamindaa
 * 
 *         <p/>
 *         date Nov 1, 2012
 */
public class Team extends AbstractEntity implements Comparable<Team> {

	/**
	 * Holds the name of the team.
	 */
	private String teamName;

	/**
	 * Holds the played matches of the team.
	 */
	private Integer playedMatches;

	/**
	 * Holds the no of wins of the team.
	 */
	private Integer noOfWins;

	/**
	 * Holds the no of losses of the team.
	 */
	private Integer noOfLosses;

	/**
	 * Holds the no of draws of the team.
	 */
	private Integer noOfDraws;

	/**
	 * Holds the goals scored by the team.
	 */
	private Integer forGoals;

	/**
	 * Holds the goals scored against the team.
	 */
	private Integer againstGoals;

	/**
	 * Holds the total points scored by the team..
	 */
	private Integer totalPoints;

	/**
	 * Empty constructor.
	 */
	public Team() {

	}

	/**
	 * Constructor with team details.
	 * 
	 * @param id
	 *            to set the ID of the team.
	 * @param teamName
	 *            to set the name of the team.
	 * @param playedMatches
	 *            to set the played matches.
	 * @param noOfWins
	 *            to set the no of wins.
	 * @param noOfLosses
	 *            to set the no of losses.
	 * @param noOfDraws
	 *            to set the no of draws.
	 * @param forGoals
	 *            to set the no of goals.
	 * @param againstGoals
	 *            to set the against goals.
	 * @param totalPoints
	 *            to set the total points.
	 */
	public Team(Integer id, String teamName, Integer playedMatches, Integer noOfWins, Integer noOfLosses,
			Integer noOfDraws, Integer forGoals, Integer againstGoals, Integer totalPoints) {
		super(id);
		this.teamName = teamName;
		this.playedMatches = playedMatches;
		this.noOfWins = noOfWins;
		this.noOfLosses = noOfLosses;
		this.noOfDraws = noOfDraws;
		this.forGoals = forGoals;
		this.againstGoals = againstGoals;
		this.totalPoints = totalPoints;

	}

	/**
	 * Getter method for teamName
	 * 
	 * @return the teamName
	 */
	public String getTeamName() {
		return teamName;
	}

	/**
	 * Setter method for teamName
	 * 
	 * @param teamName
	 *            for setting teamName value
	 */
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	/**
	 * Getter method for playedMatches
	 * 
	 * @return the playedMatches
	 */
	public Integer getPlayedMatches() {
		return playedMatches;
	}

	/**
	 * Setter method for playedMatches
	 * 
	 * @param playedMatches
	 *            for setting playedMatches value
	 */
	public void setPlayedMatches(Integer playedMatches) {
		this.playedMatches = playedMatches;
	}

	/**
	 * Getter method for noOfWins
	 * 
	 * @return the noOfWins
	 */
	public Integer getNoOfWins() {
		return noOfWins;
	}

	/**
	 * Setter method for noOfWins
	 * 
	 * @param noOfWins
	 *            for setting noOfWins value
	 */
	public void setNoOfWins(Integer noOfWins) {
		this.noOfWins = noOfWins;
	}

	/**
	 * Getter method for noOfLosses
	 * 
	 * @return the noOfLosses
	 */
	public Integer getNoOfLosses() {
		return noOfLosses;
	}

	/**
	 * Setter method for noOfLosses
	 * 
	 * @param noOfLosses
	 *            for setting noOfLosses value
	 */
	public void setNoOfLosses(Integer noOfLosses) {
		this.noOfLosses = noOfLosses;
	}

	/**
	 * Getter method for noOfDraws
	 * 
	 * @return the noOfDraws
	 */
	public Integer getNoOfDraws() {
		return noOfDraws;
	}

	/**
	 * Setter method for noOfDraws
	 * 
	 * @param noOfDraws
	 *            for setting noOfDraws value
	 */
	public void setNoOfDraws(Integer noOfDraws) {
		this.noOfDraws = noOfDraws;
	}

	/**
	 * Getter method for forGoals
	 * 
	 * @return the forGoals
	 */
	public Integer getForGoals() {
		return forGoals;
	}

	/**
	 * Setter method for forGoals
	 * 
	 * @param forGoals
	 *            for setting forGoals value
	 */
	public void setForGoals(Integer forGoals) {
		this.forGoals = forGoals;
	}

	/**
	 * Getter method for againstGoals
	 * 
	 * @return the againstGoals
	 */
	public Integer getAgainstGoals() {
		return againstGoals;
	}

	/**
	 * Setter method for againstGoals
	 * 
	 * @param againstGoals
	 *            for setting againstGoals value
	 */
	public void setAgainstGoals(Integer againstGoals) {
		this.againstGoals = againstGoals;
	}

	/**
	 * Getter method for totalPoints
	 * 
	 * @return the totalPoints
	 */
	public Integer getTotalPoints() {
		return totalPoints;
	}

	/**
	 * Setter method for totalPoints
	 * 
	 * @param totalPoints
	 *            for setting totalPoints value
	 */
	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}

	/*
	 * Calculates the absolute difference between for and against.
	 */
	private int getAbsoluteDiff() {
		int difference = Math.abs(getForGoals() - getAgainstGoals());
		return difference;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Team otherTeam) {
		int value = 0;
		if (otherTeam != null) {
			value = this.getAbsoluteDiff() - otherTeam.getAbsoluteDiff();
		}
		return value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.getTeamName();
	}

}
