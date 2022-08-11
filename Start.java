import Classes.*;

import java.util.Scanner;

class Start {
    public static void main(String []args){
            int choice = 0,subChoice = 0;

            
			Scanner in = new Scanner( System.in );
            Parkingplace x = new Parkingplace();
            while(true){
            	try {
                System.out.println("1. Driver Management");
                System.out.println("2. Passenger Management");
                System.out.println("3. Ride Transactions");
                System.out.println("4. Exit");
                System.out.println("Enter your choice:");
                choice = in.nextInt();
                in.nextLine();
            	}
                catch(Exception e) {
            		System.out.println("Error occured.Please try again.");
            		break;
            	}
                switch(choice) {
                case 1 :{
                    while(true){
                    	try {
                        System.out.println("\nOptions for Driver Management:");
                        System.out.println("\n1.Insert New Driver");
                        System.out.println("\n2.Remove existing Driver");
                        System.out.println("\n3.Show all Driver");
                        System.out.println("\n4.Going back");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                    	}catch(Exception e) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                        if(subChoice==1){
                        	try {
                            Driver d = new Driver();
                            String newDriverName;
                            String newDriverId;
                            double newSalary;

                            System.out.println("\nEnter the name of the Driver:");
                            newDriverName = in.nextLine();
                            System.out.println("\nEnter the Id of the Driver:");
                            newDriverId = in.nextLine();
                            System.out.println("\nEnter the salary of the Driver:");
                            newSalary = in.nextDouble();
                            
                            d.setName(newDriverName);
                            d.setdId(Integer.parseInt(newDriverId));
                            in.nextLine();
                            d.setSalary(newSalary);
                            
                            x.insertDriver(d);
                        	}catch(Exception d) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==2){
                        	try {
                            Driver d = new Driver();
                            String searchDId;
                            System.out.println("\nEnter the DId of your Driver you want to remove:");
                            searchDId = in.nextLine();
                            int id = Integer.parseInt(searchDId);
                            d.setdId(id);
                            x.removeDriver(d);
                        	}catch(Exception d) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==3){
                            x.showAllDrivers();
                        }
                        else if(subChoice==4){
                            break;
                        }
                        
                }
                    break;
                }
                case 2:{
                    while(true){
                    	try {
                        System.out.println("\nOptions for Passenger Management:");
                        System.out.println("\n1.Insert New Passenger:");
                        System.out.println("\n2.Remove Existing Passenger:");
                        System.out.println("\n3.Show All Passenger:");
                        System.out.println("\n4.Going Back.");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                    	}catch(Exception d) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                        if(subChoice==1){
                        	try {
                            Passenger p = new Passenger();
                            String newPassengerName;
                            int newPassengerId;
                            

                            System.out.println("\nEnter the name of the Passenger:");
                            newPassengerName = in.nextLine();
                            System.out.println("\nEnter the Id of the Passenger:");
                            newPassengerId = in.nextInt();
                            in.nextLine();
                            
                            p.setName(newPassengerName);
                            
                            p.setPid(newPassengerId);
                            
                            
                            x.insertPassenger(p);
                        	}catch(Exception d) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==2){
                        	try {
                            Passenger p = new Passenger();
                            int searchPId;
                            System.out.println("\nEnter the PId of the Passenger you want to remove:");
                            searchPId = in.nextInt();
                            p.setPid(searchPId);
                            x.removePassenger(p);
                        	}catch(Exception d) {
                        		break;
                        	}
                        }
                        else if(subChoice==3){
                            x.showAllPassengers();
                        }
                        else if(subChoice==4){
                            break;
                        }
                        
                }
                    break;
                }
                case 3:{
                    while(true){
                    	try {
                        System.out.println("\nOptions for Ride transactions:");
                        System.out.println("\n1.Adding Ride");
                        System.out.println("\n2.Withdraw Ride");
                        System.out.println("\n3.Going Back");
                        System.out.println("\nEnter your option:");
                        subChoice = in.nextInt();
                        in.nextLine();
                    	}catch(Exception d) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                        if(subChoice==1){
                        	try {
                            Ride r = new Ride();
                            FileReadWriteDemo frd=new FileReadWriteDemo();
                            //int NewRideNumber;
                            //int NewRoad;
                            int qnt;
                            
                            System.out.println("\nEnter the total number of Ride you want to add:");
                            qnt = in.nextInt();
                            frd.writeInFile(Integer.toString(qnt));

                            in.nextLine();
                            r.adding(qnt);
                            
                        }catch(Exception d) {
                    		System.out.println("Error occured.Please try again.");
                    		break;
                    	}
                            
                        }
                        else if(subChoice==2){
                        	try {
                        	Ride r = new Ride();
                            FileReadWriteDemo frd=new FileReadWriteDemo();
                            
                            int searchCN;
                            System.out.println("\nHow many ride do you want to remove:");
                            searchCN = in.nextInt();
                            frd.writeInFile(Integer.toString(searchCN));
                            r.dropping(searchCN);
                           
                        	}catch(Exception d) {
                        		System.out.println("Error occured.Please try again.");
                        		break;
                        	}
                        }
                        else if(subChoice==3){
                            break;
                        }
                        
                }
                    break;
                }
                case 4:
                	System.exit(0);
                	break;
                default:
                	System.out.println("Invalid Option.");
                	break;
                }
                	
            
                }
    
            
            
        
        
    }
}