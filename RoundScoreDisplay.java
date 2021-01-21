public class RoundScoreDisplay implements Observer{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;
	
	public RoundScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		golfer.registerObserver(this);
	}
	
	public void update(int strokes, int par) {
		strokesTotal += strokes;
		parTotal += par;
		displayRoundScore();
	}
	
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