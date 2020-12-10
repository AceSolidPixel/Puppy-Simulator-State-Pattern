/** PlayState class represents what happens when the 
     *  puppy is currently playing
     */
public class PlayState implements PuppyState
{
  /** play method represents when the puppy is played with
    *  @param Puppy p parameter to change state of puppy
    *  @return none since the method is void
    */
  @Override
  public void play(Puppy p)
  {
    System.out.println("You throw the ball again and puppy chases after it.");
  }
  
  /** feed method represents when the puppy is fed
    *  @param Puppy p parameter to change state of puppy
    *  @return none since the method is void
    */
  @Override
  public void feed(Puppy p)
  {
    System.out.println("You stop playing to feed the puppy");
    p.setState(new EatState());
  }
}