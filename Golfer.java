import java.util.ArrayList;

public class Golfer implements Subject {
	private String name;
	private ArrayList<Observer> observers;
	
	public Golfer(String name) {
        observers = new ArrayList<Observer>();
        this.name = name;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
    }
    
    @Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}	
	
	@Override
	public void notifyObservers(int strokes, int par) {
		for(Observer observer : observers) {
			System.out.println();
			observer.update(strokes, par);
		}
    }
    
    public void enterScore(int strokes, int par) {
		notifyObservers(strokes, par);
    }
    
    public String getName() {
        return this.name;
    }

}
