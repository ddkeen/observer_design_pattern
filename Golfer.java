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
            //observer.update(strokes);
            //observer.update(par);
		}
    }
    
    public void enterScore(int strokes, int par) {
		//notifyObservers();
    }
    
    public String getName() {
        return this.name;
    }

}
