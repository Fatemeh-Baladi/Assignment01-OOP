
/*Object Oriented Programming Assignment01
 * Fatemeh Baladi (041042258)
 * Lab Professor: David Houtman
 * Theory Professor: Hesham Saadawi
 * Lab Section 313
 * Due date: March 12th 2022
 */

/**
 * This is the Action Superclass class that provides a catalog of actions to be
 * carried out in view of COVID-19 OPH protocols. You are required to complete
 * read and review this code to appropriately fill the required loopholes.
 * 
 * @author - Fatemeh Baladi
 * @version 11.0.12
 * @see Action
 * @see RegularAction
 * @see OccasionalAction
 * @see RareAction
 */
abstract class Action {
	protected int day;
	protected int month;
	protected int year;

	protected String description;

	/**
	 * Constructs an action without a description.
	 */
	public Action() {
		description = "";
	}

	/**
	 * This portion constructs an Action object.
	 * 
	 * @param description the text description of the action
	 */

	public Action(String description) {
		this.description = description;
	}

	/**
	 * Sets the description of this action.
	 * 
	 * @param description the text description of the action
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Determines if this action occurs on the specified date.
	 * 
	 * @param year  the year
	 * @param month the month
	 * @param day   the day
	 * @return true if the action activity occurs on the specified date.
	 */

	public abstract boolean occursOn(int day, int month, int year);

	/**
	 * Converts action activity to string description.
	 */
	public String toString() {
		return description;
	}
}
