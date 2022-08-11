package Classes;
import java.util.ArrayList;

import java.util.List;
import Interface.*;

public class Parkingplace implements DriverOperations,PassengerOperations {
	Driver dirver;//reference object of Driver class.
	Passenger passenger;
	List<String> Dlist = new ArrayList<String>(100);//Driver array list.
	List<String> PList=new ArrayList<String>(100);

	public void getDriver(String dId) {

	}

	public void showAllDrivers() {
		System.out.println("\n Drivers are:" + Dlist);
	}

	public void setDriver(Driver d) {
		

		d.setName(d.name);
		d.setdId(Integer.parseInt(d.did));
		d.setSalary(d.salary);
	}

	public void insertDriver(Driver d) {

		setDriver(d);

		Dlist.add(d.getName());
		Dlist.add(Integer.toString(d.getDId()));
		Dlist.add(Double.toString(d.getSalary()));
		

		System.out.println("Driver added sucessfully...");
	}

	public void removeDriver(Driver d) {

		int i = 1;

	    while(i<Dlist.size()) {
	        System.out.println(Dlist.get(i));
	        if(d.did.equals(Dlist.get(i)))
	        {
	            System.out.println("Match found.");
	            Dlist.remove(i-1);
	            Dlist.remove(i-1);
	            Dlist.remove(i-1);
	        }
	        else
	        {
	            i+=3;
	        }
	    }

	}

	
	public void setPassenger(Passenger p) {
		p.setName(p.name);
		p.setPid(p.pid);
	}

	public void getPassenger(int pid) {
		
	}

	public void insertPassenger(Passenger p) {
		setPassenger(p);

		PList.add(p.getName());
		PList.add(Integer.toString(p.getPid()));
		
		System.out.println("Passenger added successfully.");
		
	}
	public void removePassenger(Passenger p) {
		int i = 1;

	    while(i<PList.size()) {
	        System.out.println(PList.get(i));
	        if((Integer.toString(p.pid)).equals(PList.get(i)))
	        {
	            System.out.println("Passenger removed.");
	            PList.remove(i-1);
	            PList.remove(i-1);
	        }
	        else
	        {
	            i+=2;
	        }
	    }
		
	}

	public void showAllPassengers() {
		System.out.println("Passenger List: "+PList);
		
	}
}
