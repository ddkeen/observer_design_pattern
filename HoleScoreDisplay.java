public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;
	
	public HoleScoreDisplay(Subject golfer) {
		this.golfer = golfer;
		//golfer.registerObserver(this);
	}
	
	public void update(int strokes, int par) {
		
	}
	
	private void displayCurrentScore() {
		System.out.println("");
	}
}
