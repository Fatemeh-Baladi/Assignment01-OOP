
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
 * Action has a description (for example, "Take a PCR test") that occurs on the
 * same day of every month specified.
 */

public class OccasionalAction extends Action {

	public boolean occursOn(int day, int month, int year) { // if the activity has happened in the same day as entered
															// by the customer,
															// it will be returned true.

		if (day == this.day) {

			return true;
		} else { // if the activity has not had happened in the same day as entered by the
					// customer,
					// it will be returned false.
			return false;
		}

	}

	/**
	 * OccasionalAction constructor that has one extra field, that stores the day of
	 * the month on which that action occurs
	 * 
	 * @param day         the day
	 * @param description the text description of the action
	 */

	public OccasionalAction(int day, String description) {
		super(description);
		this.day = day;

	}

	/**
	 * Converts action activity to string description.
	 */
	public String toString() {
		return description;

	}

}
