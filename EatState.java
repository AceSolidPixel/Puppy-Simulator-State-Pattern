/** EatState class represents what happens when the 
     *  puppy is currently eating
     */
public class EatState implements PuppyState
{
  /** play method represents when the puppy is played with
    *  @param Puppy p parameter to change state of puppy
    *  @return none since the method is void
    */
  @Override
  public void play(Puppy p)
  {
    System.out.println("You throw a tennis ball and the puppy chases it.");
    p.setState(new PlayState());
  }
  
  /** feed method represents when the puppy is fed
    *  @param Puppy p parameter to change state of puppy
    *  @return none since the method is void
    */
  @Override
  public void feed(Puppy p)
  {
    System.out.println("You give the puppy more food and it eats happily.");
  }
}