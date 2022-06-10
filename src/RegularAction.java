
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
 * This is a subclass of the Action Superclass. RegularAction extends the Action
 * class. Action has a description (for example, "Wash your hands") and occurss
 * on one or more dates. A regularAction activity occurs every day.
 */

public class RegularAction extends Action {

	/**
	 * Determines if this action occurs on the specified date.
	 * 
	 * @param year  the year
	 * @param month the month
	 * @param day   the day
	 * @return true if the action activity occurs on the specified date.
	 */
	public boolean occursOn(int day, int month, int year) {

		return true;

	}

	/**
	 * Regular action extends the action class.
	 * 
	 * @param description the text description of the action
	 */

	public RegularAction(String description) {

		super(description);

	}

	/**
	 * Converts action activity to string description.
	 */

	public String toString() {

		return description;

	}

}
