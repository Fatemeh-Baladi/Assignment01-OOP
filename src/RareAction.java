
/*Object Oriented Programming Assignment01
 * Fatemeh Baladi (041042258)
 * Lab Professor: David Houtman
 * Theory Professor: Hesham Saadawi
 * Lab Section 313
 * Due date: March 12th 2022
 */

/**
 *
 * @author - Fatemeh Baladi
 * @version 11.0.12
 * @see Action
 * @see RegularAction
 * @see OccasionalAction
 * @see RareAction
 */
/**
 * This is a subclass of the Action Superclass. It extends the Action class.
 * Action has a description (for example, "Get a booster shot") Activities for
 * RareAction occurs on a particular date of the year specified.
 */

public class RareAction extends Action {

	public boolean occursOn(int day, int month, int year) {

		return (day == this.day && month == this.month); // if the activity has happened in the same day and month as
														// entered
			// by the customer,
			// it will be returned true.
			

	}

	/**
	 * OccasionalAction constructor that has two extra fields, that stores the day
	 * and the month on which that action occurs
	 * 
	 * @param day         the day of the action happening
	 * @param month       the month of the action happening
	 * @param description the text description of the action
	 */
	public RareAction(int day, int month, String description) {
		super(description);

		this.day = day;
		this.month = month;

	}

	/**
	 * Converts action activity to string description.
	 */

	public String toString() {
		return description;

	}
}
