/**
 * Class to display the golfers strokes and score relative to par for each round
 * Implements the Observer interface
 * @author ddkeen
 */
public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;
	
	/**
	 * Creates a HoleScoreDisplay Object that observes the Golfer
	 * the golfer adds the observer to the arrayList of observers
	 * @param golfer the golfer being observed
	 */
	public HoleScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		golfer.registerObserver(this);
	}
	
	/**
	 * Updates the private instance varibales of this observer object then displays the current scores for the golfer
	 * @param strokes the number of strokes the golfer took for the hole
	 * @param par the par for the hole
	 */
	public void update(int strokes, int par) {
		this.strokes = strokes;
		this.par = par;
		displayCurrentScore();
	}
	
	/**
	 * Displays the stats of the current hole including par, strokes on the hole, and strokes under or over par
	 */
	private void displayCurrentScore() {
		System.out.println("Current hole stats: \nPar: " + par + "\nStrokes: " + strokes);

		if (strokes > par) {
			System.out.println(strokes - par + " over par");
		} else if (par > strokes) {
			System.out.println(par - strokes + " under par");
		} else {
			 System.out.println("Made par");
		}
	}
}
