
/*Object Oriented Programming Assignment01
 * Fatemeh Baladi (041042258)
 * Lab Professor: David Houtman
 * Theory Professor: Hesham Saadawi
 * Lab Section 313
 * Due date: March 12th 2022
 */

import java.lang.reflect.*;
import java.util.Scanner;

/**
*
* @author - Fatemeh Baladi
* @version 11.0.12
* @see Action,RegularAction, OccasionalAction, RareAction
*/
/**
 * The reason for this class is to demonstrate the Action class and subclasses.
 * This is a test class for the Action class subclasses. This class instantiate
 * instances of Action subclasses with random dates and descriptions, and puts
 * these values into an array of objects. It loops through that array,
 * occursOn() would be checked in all the subclasses. It it returns true in any
 * classes, the console shows the relevant description for that specific date.
 * @author - Fatemeh Baladi
 * @version 11.0.12
 * @see Action
 * @see RegularAction
 * @see OccasionalAction
 * @see RareAction
 */

public class AllActionTest {
	/**
	 * 
	 * @param args is an array of strings.
	 */
	public static void main(String[] args) {
		Scanner action = new Scanner(System.in);

		RegularAction test = new RegularAction("wash your hands");
		RareAction test1 = new RareAction(11, 05, "Get a booster shot");
		OccasionalAction test2 = new OccasionalAction(17, "take a PCR test");

		Action[] objects = new Action[4]; // array of abjects for Action class subclasses
		objects[0] = new RegularAction("Wash your hands");
		objects[1] = new RegularAction("Sit two meters apart");
		objects[2] = new RareAction(05, 11, "Get a booster shot");
		objects[3] = new OccasionalAction(17, "Take a PCR test");

		System.out.println("Enter a date YYYY MM DD ");

		int day = action.nextInt();
		int month = action.nextInt();
		int year = action.nextInt();

		// printing out the day in the format of day/month/year
		System.out.println("These are your actions on " + day + "/" + month + "/" + year);
		// looping through the array to check the occursOn() method

		for (int index = 0; index < objects.length; index++) {

			if (objects[index].occursOn(day, month, year)) {

				System.out.println(objects[index].toString());

			}

		}

	}
}
