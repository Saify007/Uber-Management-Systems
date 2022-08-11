package Interface;//this package includes all the interfaces

import Classes.Ride;//importing class from classes package

public interface RideOperations {
	public abstract void insertRide(Ride r);
	public abstract void removeRide(Ride r);
	public abstract Ride getRide(int RideNumber);
	public abstract void showAllRide();

}