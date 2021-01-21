public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;
	
	public HoleScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		golfer.registerObserver(this);
	}
	
	public void update(int strokes, int par) {
		this.strokes = strokes;
		this.par = par;
		displayCurrentScore();
		
	}
	
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
