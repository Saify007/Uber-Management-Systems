package Interface;

import Classes.Passenger;

public interface PassengerOperations {
	public abstract void setPassenger(Passenger p);
	public abstract void getPassenger(int pid);
	public abstract void insertPassenger(Passenger p);
	public abstract void removePassenger(Passenger p);
	public abstract void showAllPassengers();
}
