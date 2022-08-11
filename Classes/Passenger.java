package Classes;//This package includes all the classes

import java.util.ArrayList;
import java.util.List;

import Interface.RideOperations;
public class Passenger implements RideOperations {
	protected String name;
	protected int pid;
	Ride ride;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setPid(int pid) {
		this.pid=pid;;
	}
	public String getName() {
		return name;
	}
	public int getPid( ) {
		return pid;
	}

	List<String> RList = new ArrayList<String>();
	
	public void setRide(Ride r) {

		r.setRideNumber(r.rideNumber);
		r.setRoad(r.road);
	}

	public void insertRide(Ride r) {

		setRide(r);

		RList.add(Integer.toString(r.getRoad()));
		RList.add(Integer.toString(r.getRideNumber()));
		

		System.out.println("Ride added successfully.");
	}

	public void removeRide(Ride r) {

		
		int i = 1;

	    while(i<RList.size()) {
	        System.out.println(RList.get(i));
	        if((Integer.toString(r.rideNumber)).equals(RList.get(i)))
	        {
	            System.out.println("Ride removed.");
	            RList.remove(i-1);
	            RList.remove(i-1);
	        }
	        else
	        {
	            i+=2;
	        }
	    }	
	}

	public Ride getRide(int RideNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public void showAllRide() {
		System.out.println("\n Ride are:" + RList);

	}
}
