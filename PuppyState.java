/** PuppyState interface is created as a template for concrete state classes
     */
public interface PuppyState
{
    /** play method is created as a template for other state classes
     *  @param Puppy p parameter to change state of puppy
     *  @return none since the method is void
     */
    public void play(Puppy p);
    /** feed method is created as a template for other state classes
     *  @param Puppy p parameter to change state of puppy
     *  @return none since the method is void
     */
    public void feed(Puppy p);
}