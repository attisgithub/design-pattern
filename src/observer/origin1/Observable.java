package observer.origin1;

public interface Observable {
	
	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers(Object context);
	
}
