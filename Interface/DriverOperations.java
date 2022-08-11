package Interface;

import Classes.Driver;

public interface DriverOperations {
	public abstract void setDriver(Driver d);
	public abstract void getDriver(String did);
	public abstract void insertDriver(Driver d);
	public abstract void removeDriver(Driver d);
	public abstract void showAllDrivers();

}
