import java.util.Scanner;
/** Main class contains the main method which allows 
     *  for the user to execute and interact with the program
     */
class Main 
{
  /**
  * Main method that excecutes the program.
  */
  public static void main(String[] args) 
  {
    Puppy p = new Puppy();
    System.out.println("Congratulations on your new puppy!");
    int input = 0;
    while(input != 3)  
    {
      System.out.println("What would you like to do?");
      System.out.println("1. Feed");
      System.out.println("2. Play");
      System.out.println("3. Quit");
      input = getIntRange(1,3);
      if(input == 1)
      {
        p.feedPuppy();
      }else if(input == 2)
      {
        p.playPuppy();
      }
    }
  }
  /**
	 * Checks if the inputted value is an integer and 
	 * within the specified range (ex: 1-10)
	 * @param low lower bound of the range.
	 * @param high upper bound of the range.
	 * @return the valid input.
	 */
	public static int getIntRange( int low, int high ) 
  {
		Scanner in = new Scanner( System.in );
		int input = 0;
		boolean valid = false;
		while( !valid ) 
    {
			if( in.hasNextInt() ) 
      {
				input = in.nextInt();
				if( input <= high && input >= low ) 
        {
					valid = true;
				} 
        else 
        {
					System.out.println( "Invalid Range." );
				}
			} else 
      {
				in.next(); //clear invalid string
				System.out.println( "Invalid Input." );
			}
		}
		return input;
	}
}