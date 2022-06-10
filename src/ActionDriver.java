
/*Object Oriented Programming Assignment01
 * Fatemeh Baladi (041042258)
 * Lab Professor: David Houtman
 * Theory Professor: Hesham Saadawi
 * Lab Section 313
 * Due date: March 12th 2022
 */

import java.lang.reflect.*;

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
 * This is the test class for the Regularaction class. It tests if Action class
 * is the superclass for the RegularAction class. It also tests if RegularAction
 * class does not have extra fields compared to its superclass (the action
 * class).
 * 
 */
public class ActionDriver {

	/**
	 * 
	 * @param args is an array of strings.
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		RegularAction test = new RegularAction("wash your hands");

		if (test.getClass().getSuperclass() == Action.class) {// this code will run if the Action class is the super
																// class for RegularAction class

			System.out.println("RegularAction is just a subclass of Action: " + "true");
			System.out.println("Expected = true");
		} else { // this code will run if the Action class is not the super class for
					// RegularAction class
			System.out.println("RegularAction is just a subclass of Action: " + "false");

		}

		if (RegularAction.class.getDeclaredFields().length == 0) {// this code will run if the RegularAction class does
																	// not have extra fields

			System.out.println("RegularAction activities have no extra fields: " + "true");

			System.out.println("Expected = true");
		} else { // this code will run if the RegularAction class does have extra fields
			System.out.println("RegularAction activities have no extra fields: " + "false");

		}

		System.out.println("Expected= " + test.toString()); // this statement returns the description from RegularAction
															// class

		System.out.println(test.occursOn(14, 05, 2022)); // this statement returns true if if the action activity
															// occurs on the specified date.

		System.out.println("Expected = true");

	}

}
