
/**
 * Class to display an updated total score for the golfer's round after each hole
 * Implements the Observer class
 * @author ddkeen
 */
public class RoundScoreDisplay implements Observer{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;
	
	/**
	 * Creates a roundScoreDisplay Object that obseres the given golfer
	 * This obserfer is added to the arraylist of observes for the golfer
	 * @param golfer the golfer to be observed
	 */
	public RoundScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		golfer.registerObserver(this);
	}
	
	/**
	 * Updates the instance variables parTotal and strokesTotal by adding the current par and strokes for the hole
	 * This method then displays the current total score for the round
	 * @param strokes the number of strokes the golfer took on the hole
	 * @param par the par for the hole
	 */
	public void update(int strokes, int par) {
		strokesTotal += strokes;
		parTotal += par;
		displayRoundScore();
	}
	
	/**
	 * Displays the stats of the golfer's round thus far including total par for the course, total strokes for the course, and total strokes under or over par
	 */
	private void displayRoundScore() {
		System.out.println("Round stats: \nPar: " + parTotal + "\nStrokes: " + strokesTotal);
		
		if (strokesTotal > parTotal) {
			System.out.println(strokesTotal - parTotal + " over par");
		} else if (parTotal > strokesTotal) {
			System.out.println(parTotal - strokesTotal + " under par");
		} else {
			 System.out.println("Making par");
		}
	}
}