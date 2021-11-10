//Customer Class that stores all the information about a customer that will eventually be stored in a customers ArrayList to be sorted


import java.util.Scanner;
public class Customer 
{
	//The different visiting purposes score
	private static final int PAY_BILL = 4;
	private static final int DRIVER_LICENSE = 5;
	private static final int VEHICLE_REGISTRATION = 6;
	private static final int APPOINTMENT = 8;
	
	Scanner sc = new Scanner(System.in);
	private String name;
	private int age;
	private int time = 0;
	private String purposes;
	

	
	private int waitingScore = 0;
	
	//Customer constructor initializes time, name, age, and purposes
	//Initializes the Customer waiting score by summing the purposes and subtracting from 100
	public Customer(int time, String name, int age, String purposes)
	{
		this.name = name;
		this.age = age;
		this.time = time;
		this.purposes = purposes;
		
		waitingScore = 100;
		
		//splits the string purpose numbers by commas and stores in an array
		String[] numbers = purposes.split(",");
		
		for(String s: numbers) {
			int temp = Integer.parseInt(s); //converts each string number to an integer number
			
			if(temp <1 || temp >4)
				throw new IndexOutOfBoundsException("Not a valid purpose");
			//calculates waiting score
			if (temp == 1 || temp == 2 || temp == 3|| temp ==4)
			{
				if(temp == 1)
					waitingScore -= PAY_BILL;
				if(temp == 2)
					waitingScore -= DRIVER_LICENSE;
				if(temp == 3)
					waitingScore -=VEHICLE_REGISTRATION;
				if(temp == 4)
					waitingScore -= APPOINTMENT;
			}
		}
	}
	
	//set new customer name inputed by user
	public void setName()
	{
		String newName = sc.nextLine();
		name = newName;
	}

	//set new customer age inputed by user
	public void setAge()
	{
		int newAge = sc.nextInt();
		age = newAge;
	}
	
	//set new customer ArrivingTime inputed by user
	//Checks to make sure it is a valid ArrivingTime
	public void setArrivingTime()
	{
		int newArrivingTime = sc.nextInt();
		if(newArrivingTime < 1 || newArrivingTime > 9999)
			System.out.println("Error invalid time");
		else time = newArrivingTime;
	}
	
	//sets new customer purposes inputed by user
	public void setPurposes()
	{
		String newPurposes = sc.nextLine();
		String[] temp = newPurposes.split(","); //splits the new inputed string
		
		for(String s: temp) {
			int i = Integer.parseInt(s); //converts the number string into an integer
			if(i <1 || i >4) //checks if the new purposes are valid
				throw new IndexOutOfBoundsException("Not a valid purpose");
		}
		
		purposes = newPurposes;
		String[] numbers = purposes.split(",");
		waitingScore = 100;
		for(String s: numbers) {
			int tempo = Integer.parseInt(s); //converts each string number to an integer number
			
			if(tempo <1 || tempo >4)
				throw new IndexOutOfBoundsException("Not a valid purpose");
			//calculates waiting score
			if (tempo == 1 || tempo == 2 || tempo == 3|| tempo ==4)
			{
				if(tempo == 1)
					waitingScore -= PAY_BILL;
				if(tempo == 2)
					waitingScore -= DRIVER_LICENSE;
				if(tempo == 3)
					waitingScore -=VEHICLE_REGISTRATION;
				if(tempo == 4)
					waitingScore -= APPOINTMENT;
			}
		}
			
		
	}
	
	//sets the new customer WaitingScore inputed by user
	public void setWaitingScore()
	{
		int newScore = sc.nextInt();
		//checks if newScore is in Valid range(cannot go lower than 77 or higher than 100)
		if(newScore > 100 || newScore < 77)
			throw new IndexOutOfBoundsException("Invalid Score");
		else waitingScore = newScore;
	}
	
	//returns the customer Name
	public String getName()
	{
		return this.name;
	}
	
	//returns the customer Age
	public int getAge()
	{
		return this.age;
	}
	
	//returns the customer ArrivingTime
	public int getArrivingTime()
	{
		return this.time;
	}
	
	//returns the customer Purposes
	public String getPurposes()
	{
		return this.purposes;
	}
	
	//returns the customer WaitingScore
	public int getWaitingScore()
	{
		return this.waitingScore;
	}

	

}
