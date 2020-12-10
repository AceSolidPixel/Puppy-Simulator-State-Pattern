/** SleepState class represents what happens when the 
     *  puppy is currently sleeping
     */
public class SleepState implements PuppyState
{
  /** play method represents when the puppy is played with
    *  @param Puppy p parameter to change state of puppy
    *  @return none since the method is void
    */
  @Override
  public void play(Puppy p)
  {
    System.out.println("Puppy is asleep, try feeding it to wake up.");
  }
  
  /** feed method represents when the puppy is fed
    *  @param Puppy p parameter to change state of puppy
    *  @return none since the method is void
    */
  @Override
  public void feed(Puppy p)
  {
    System.out.println("Puppy wakes up and starts to eat the food.");
    p.setState(new EatState());
  }
}