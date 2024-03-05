import java.io.FileNotFoundException;

/**
 * Reads in configurations of potential solutions to Skyscraper puzzles and
 * evaluates their validity before printing out both the grids and their status
 * as an answer to the puzzles.
 *
 * @author Varik Hoang <varikmp@uw.edu>
 * @author FIRST_NAME LAST_NAME <SCHOOL_EMAIL>
 * @version __________
 */
public class Josiah
{
	/**
	 * The driver method to process Skyscraper puzzle settings
	 * The task is to check their validity and then print the grids along with the results of those checks.
	 *
	 * @param theArgs is used for command line input.
	 */
	public static void main(final String[] theArgs) throws FileNotFoundException
	{
		if (theArgs.length != 1)
		{
			System.out.println("ERROR: Program must be run using the name of an input file that "
					+ "contains skyscraper information as a command line argument.");
		}
		else
		{
			// START FILLING YOUR CODE HERE
			
			// END FILLING YOUR CODE HERE

			System.out.println("COMPLETED PROCESSING SKYSCRAPERS");
		}
	}

	/**
	 * Prints the Skyscraper puzzle configuration and whether it is valid or not as
	 * a solution.
	 *
	 * @param theGrid     is a 2D integer array representing a configuration of
	 *                    integers as a potential answer to a Skyscraper puzzle.
	 * @param theValidity is a boolean value representing whether the 2D integer
	 *                    array is an acceptable solution or not.
	 */
	public static void printSkyscrapers(final int[][] theGrid, final boolean theValidity)
	{
		final StringBuilder sb = new StringBuilder();
		for (int row = 0; row < theGrid.length; row++)
		{
			for (int col = 0; col < theGrid[0].length; col++)
			{
				if (theGrid[row][col] == 0)
				{
					sb.append(" ");
				}
				else
				{
					sb.append(theGrid[row][col]);
				}
			}
			sb.append("\n");
		}
		if (theValidity)
		{
			sb.append("VALID");
		}
		else
		{
			sb.append("NOT VALID");
		}
		System.out.println(sb.toString());
	}
}