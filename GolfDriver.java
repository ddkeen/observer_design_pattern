/**
 * Driver for the observer Design Pattern project
 * This concept uses Subjects who preform some action and Observers who react to the that action
 * In this case Golfers are subjects who are playing a Round of Golf. The observers are displays that show his/her score for each hole and for the current round
 * @author portiaportia
 */
public class GolfDriver {

	/**
	 * Main method for the Golf Driver, A golfer plays a round of golf and his stats are shown after each whole and totaled for the round
	 */
	public static void main(String[] args) {
		Golfer golfer = new Golfer("Georgy");
		Observer HoleScoreDisplay = new HoleScoreDisplay(golfer);
		Observer RoundScoreDisplay = new RoundScoreDisplay(golfer);
		
		System.out.println("***** " + golfer.getName() + " is staring his round *****");
		golfer.enterScore(5, 3);
		golfer.enterScore(2, 2);
		golfer.enterScore(1, 3);
		golfer.enterScore(3, 3);
		golfer.enterScore(3, 2);
	}
}

