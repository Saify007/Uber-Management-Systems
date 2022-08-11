package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Interface.RideTransactions;

public class Ride implements RideTransactions {
	int rideNumber;
	int road;
	int qnt;
	String element;
	List<String> RAddingList = new ArrayList<String>();
	Scanner input = new Scanner(System.in);
	
	public void setRideNumber(int rideNumber) {
		this.rideNumber=rideNumber;
	}

	public void setRoad(int road) {
		this.road=road;
	}

	public int getRideNumber() {
		return rideNumber;
	}

	public int getRoad() {
		return road;
	}

	public void showInfo() {
		System.out.println("Ride Number: " + getRideNumber());
		System.out.println("Road: " + getRoad());
	}

	
	public void adding(int quantity) {

		    for (int i = 0; i < quantity; i++) {
		        System.out.print("Insert   Ride: ");
		        element = input.next();
		        RAddingList.add(element);
		    }
		    System.out.println();
		    System.out.println("Ride added successfully\n\n");
		    for (int i = 0; i < RAddingList.size(); i++) {
		        System.out.println(RAddingList.get(i));
		    }
		
	}
	public void dropping(int quantity) {
		int i = 0;
		String RName;
		
	    for(int j=0;j<quantity;j++)
	    {
	    while(i<RAddingList.size()) {
	    	System.out.print("Insert the name of the Ride you want to drop: ");
		    RName = input.next();
	        System.out.println(RAddingList.get(i));
	        if((RName.equals(RAddingList.get(i))))
	        {
	            System.out.println("Ride dropped.");
	            RAddingList.remove(i);
	            
	        }
	        else
	        {
	            i++;
	        }
	    }	
	    	for (int k = 0; k < RAddingList.size(); i++) {
		        System.out.println(RAddingList.get(i));
		    }
	    }
	}

}

