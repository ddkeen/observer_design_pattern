public class HoleScoreDisplay implements Observer{
	Subject golfer;
	
	public Cat(Subject foodBowl) {
		this.foodBowl = foodBowl;
		foodBowl.registerObserver(this);
	}
	
	public void update(String food) {
		if(food.equals("tuna")) {
			eat();
		}
	}
	
	public void eat() {
		System.out.println("cat eating");
	}
}
