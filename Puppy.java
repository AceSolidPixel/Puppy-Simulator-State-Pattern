/** Puppy class contains the instance variables of the state the 
  *  puppy is in along with ints for number of times fed/played with
  */
public class Puppy
{
  /* Instance variable that will keep track of which state the puppy is in */
  private PuppyState state;
  /* Instance variable that will keep track of the amount of times the puppy has been fed */
  private int timesFed;
  /* Instance variable that will keep track of the amount of times the puppy has been played with */
  private int timesPlayed;

  /**
  * Constructor for this class. Puts the Puppy in a sleeping state by default 
  * and initializes timesFed and timesPlayed
  */
  public Puppy()
  {
    state = new SleepState();
    timesFed = 0;
    timesPlayed = 0;
  }

  /**
  * Changes the state of the puppy to whatever state is passed
  */
  public void setState(PuppyState s)
  {
    state = s;
  }
  
  /**
  * This method resets the variable that keeps track of  
  * the times the puppy is fed to 0
  * @param no parameters in this method
  * @return returns an int with # of times puppy is fed
  */
  public void resetTimesFed()
  {
    timesFed = 0;  
  }

  /** this method adds +1 to int timesFed every time puppy is fed
  *  @param no parameters in this method
  *  @return returns none since method is void
  */
  public void incrementTimesFed()
  {
    timesFed++;
  }

  /** this method retrieves the number of times puppy has been fed
  *  @param no parameters in this method
  *  @return returns an int with # of times puppy is fed
  */
  public int getTimesFed()
  {
    return timesFed;
  }

  /**
  * This method resets the variable that keeps track of  
  * the times the puppy is played with to 0
  * @param no parameters in this method
  * @return returns an int with # of times puppy is fed
  */
  public void resetTimesPlayed()
  {
    timesPlayed = 0;
  }

  /** this method adds +1 to int timesPlayed every time puppy is played with
  *  @param no parameters in this method
  *  @return returns none since method is void
  */
  public void incrementTimesPlayed()
  {
    timesPlayed++;
  }
  /** this method retrieves the number of times puppy has been played with
  *  @param no parameters in this method
  *  @return returns an int with # of times puppy is played with
  */
  public int getTimesPlayed()
  {
    return timesPlayed;
  }

  /**
  * Changes the state of the puppy to Eat
  */
  public void feedPuppy()
  {
    state.feed(this);
    incrementTimesFed();
    if(getTimesFed() > 2)
    {
      System.out.println("The puppy ate so much it fell asleep!");
      state = new SleepState();
      resetTimesFed();
      resetTimesPlayed();
    }
  }

  /**
  * Changes the state of the puppy to Play
  */
  public void playPuppy()
  {
    state.play(this);
    incrementTimesPlayed();
    if(getTimesPlayed() > 2)
    {
      System.out.println("The puppy played so much it fell asleep.");
      state = new SleepState();
      resetTimesFed();
      resetTimesPlayed();
    }
  }
}