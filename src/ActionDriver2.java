
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
 * This is the test class for the Rareaction and OccasionalAction class. It
 * tests if Action class is the superclass for both classes. It also tests if
 * RareAction class and OccasionalAction do not have extra fields compared to
 * its superclass (the action class).
 * 
 */
public class ActionDriver2 {
	/**
	 * 
	 * @param args is an array of strings.
	 * @throws Exception 
	 */

	public static void main(String[] args) throws Exception {

		RareAction test1 = new RareAction(2, 05, "Get a booster shot");
		OccasionalAction test2 = new OccasionalAction(5, "Take a PCR test");

		// this code will run if the Action class is the super
																// class for the RareAction class

			System.out.println("RareAction is just a subclass of Action: " +  (test1.getClass().getSuperclass() == Action.class));
		

		if (test2.getClass().getSuperclass() == Action.class) { // this code will run if the Action class is the super
																// class for OccasionalAction class

			System.out.println("OccasionalAction is just a subclass of Action: " + "true");
		} else { // this code will run if the Action class is not the super
			// class for OccasionalAction class
			System.out.println("OccasionalAction is just a subclass of Action: " + "false");

		}

		System.out.println("Expected = true");

		if (RareAction.class.getDeclaredFields().length == 0) {// this code will run if the RareAction class does
																// not have extra fields

			System.out.println("RareAction activities have no extra fields: " + "true");

			System.out.println("Expected = true");
		} else {// this code will run if the RareAction class does
				// have extra fields
			System.out.println("RareAction activities have no extra fields: " + "false");

		}

		if (OccasionalAction.class.getDeclaredFields().length == 0) {// this code will run if the occasionalAction class
																		// does
																		// not have extra fields

			System.out.println("OccasionalAction activities have no extra fields: " + "true");

			System.out.println("Expected = true");
		} else {// this code will run if the occasionalAction class
				// does have extra fields
			System.out.println("OccasionalAction activities have no extra fields: " + "false");
		}

	}
}