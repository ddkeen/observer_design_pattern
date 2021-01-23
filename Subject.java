/**
 * Interface that all Subject objects will implement
 * @author ddkeen
 */
public interface Subject {

	/**
	 * Add observers to an arraylist to be updated of the Subject's actions
	 * @param observer the observer being added to the list
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Remove observers from the arrayList to no longer be updated of the Subject's actions
	 * @param observer the observer being removed
	 */
	public void removeObserver(Observer observer);

	/**
	 * Notifies all observers of the Subject's current action
	 * For the Golfer class it notifies Observers after each hole is complete
	 * @param strokes the number of strokes taken on the hole
	 * @param par the par for the hole
	 */
    public void notifyObservers(int strokes, int par);
}