/**
 * Interface that all Observers will implement including RoundScoreDisplay and HoleScoreDisplay
 * @author ddkeen
 */
public interface Observer {

	/**
	 * Updates the instance variables for the Observer object to then be displayed
	 * @param strokes the number of strokes the golfer took on this hole
	 * @param par the par for the hole
	 */
	public void update(int strokes, int par);
}