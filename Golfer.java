import java.util.ArrayList;
/**
 * Golfer object implementing the interface Subject
 * A golfer plays a round of golf and notifies Observers of his/her strokes and par for each hole
 * @author ddkeen
 */
public class Golfer implements Subject {
	private String name;
	private ArrayList<Observer> observers;
	
	/**
	 * Creates a new Golfer with the indicated name
	 * Also creates an ArrayList of Observers that represent scores for each hole and scores for the round
	 * @param name the name of the Golfer
	 */
	public Golfer(String name) {
        observers = new ArrayList<Observer>();
        this.name = name;
	}
	
	/**
	 * Adds observers to the Observer array List
	 * This method is called after each observer is created
	 * @param observer the Observer being added to the arrayList
	 */
	public void registerObserver(Observer observer) {
		observers.add(observer);
    }
	
	/**
	 * Removes observers from the array List
	 * This method should be called if an observer should no longer be updated of the Subject's actions or is deleted
	 * @param observer the Observer being removed
	 */
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	
	
	/**
	 * Notifies all observers of the Golfers actios after a hole is complete
	 * each observer then updates its parameters and displays a message
	 * @param strokes the number of strokes the golfer took on the hole
	 * @param par the par for the hole
	 */
	public void notifyObservers(int strokes, int par) {
		for(Observer observer : observers) {
			System.out.println();
			observer.update(strokes, par);
		}
    }
	
	/**
	 * Calls the method notifyObservers to enter scores to the displays adter each hole is completed
	 * @param strokes the number of strokes the golfer took on the hole
	 * @param par the par for the hole
	 */
    public void enterScore(int strokes, int par) {
		notifyObservers(strokes, par);
    }
	
	/**
	 * Return the name of the Golfer
	 * @return name the name of the golfer
	 */
    public String getName() {
        return this.name;
    }

}
