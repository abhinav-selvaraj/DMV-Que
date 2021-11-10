//Class to show implemented tests

import java.util.Comparator;
import java.util.Scanner;
import java.util.Random;



public class DmvQue {
	static Scanner scanner = new Scanner(System.in);
	static MaxHeap m = new MaxHeap();
	static ArrivingTime a = new ArrivingTime();
	static WaitingScore w = new WaitingScore();
	static Random gen = new Random();
	static Customer[] cus;
	public static void main(String[] args) throws Exception
	{
		
		//construct new MaxHeap objects to use for testing
		
		MaxHeap m2 = new MaxHeap();
		MaxHeap m3 = new MaxHeap(); 
		MaxHeap m4 = new MaxHeap();
		MaxHeap m5 = new MaxHeap();
		
		
		//construct new Random object to set random Arriving Time for customers
		
		
		//construct Customer objects to be inserted and manipulated in the list
		Customer one = new Customer(gen.nextInt(9999),"Bob Doe", 19, "1,2,3");
		Customer two = new Customer(gen.nextInt(9999),"Mary Sue", 20, "1,2");
		Customer three = new Customer(gen.nextInt(9999),"Bruce Wayne", 35, "1,2,3");
		Customer four = new Customer(gen.nextInt(9999),"Harley Quinn", 28, "1");
		Customer five = new Customer(gen.nextInt(9999),"Jon Stewart", 34, "2");
		Customer six = new Customer(gen.nextInt(9999),"Barry Allen", 22, "1,2");
		Customer seven = new Customer(gen.nextInt(9999),"Martha Kent", 54, "4");
		Customer eight = new Customer(gen.nextInt(9999),"Lex Luthor", 47, "1,4");
		Customer nine = new Customer(gen.nextInt(9999),"Kate Kane", 27, "3");
		Customer ten = new Customer(gen.nextInt(9999),"Ryan Higa", 32, "1");
		Customer eleven = new Customer(gen.nextInt(9999),"Peter Parker", 18, "1");
		Customer twelve = new Customer(gen.nextInt(9999),"William Queen", 66, "2,4");
		Customer thirteen = new Customer(gen.nextInt(9999),"Oliver Queen", 43, "1,1");
		Customer fourteen = new Customer(gen.nextInt(9999),"Louis Lane", 33, "1,2");
		Customer fifteen = new Customer(gen.nextInt(9999),"Abhinav Selvaraj", 19, "2,3");
		Customer sixteen = new Customer(gen.nextInt(9999),"Mike Wu", 25, "3,4");
		Customer seventeen = new Customer(gen.nextInt(9999),"Mark Greyson", 52, "3,2");
		Customer eighteen = new Customer(gen.nextInt(9999),"Ash Ketchum", 21, "1,4");
		Customer nineteen = new Customer(gen.nextInt(9999),"Yugi Moto", 78, "1,3");
		Customer twenty = new Customer(gen.nextInt(9999),"Seto Kaiba", 26, "1,2,3,4");
		
		
		
		
		
		//***TEST CODE FOR HEAPSORT***

		m.customers.add(one);
		m.customers.add(two);
		m.customers.add(three);
		m.customers.add(four);
		m.customers.add(five);
		m.customers.add(six);
		m.customers.add(seven);
		m.customers.add(eight);
		m.customers.add(nine);
		m.customers.add(ten);
		m.customers.add(eleven);
		m.customers.add(twelve);
		m.customers.add(thirteen);
		m.customers.add(fourteen);
		m.customers.add(fifteen);
		m.customers.add(sixteen);
		m.customers.add(seventeen);
		m.customers.add(eighteen);
		m.customers.add(nineteen);
		m.customers.add(twenty);
		
		
		System.out.println("Here is the current unsorted list \n");
		for(int i = 0; i < m.customers.size();i++)
		{
			Customer temp = m.customers.get(i);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")");
		}
		System.out.println();
		displayOptions();
/*TESTS*		
		m.heapSort(a); //Sorts the list based on Arriving Time
		System.out.println("The heapSorted list based on Arriving Time is:");
		
		//loop to print out sorted list
		for(int i = 0; i < m.customers.size();i++)
		{
			Customer temp = m.customers.get(i);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")");
		}
				
		System.out.println();	
		
		//Test to see if user can change certain customer arriving time
		System.out.println("Enter new Arriving time for customer 1: ");
		m.customers.get(0).setArrivingTime();
		System.out.println("Enter new Arriving time for customer 2: ");
		m.customers.get(1).setArrivingTime();
		System.out.println("Enter new Arriving time for customer 3: ");
		m.customers.get(2).setArrivingTime();
		System.out.println("Enter new Arriving time for customer 4: ");
		m.customers.get(3).setArrivingTime();
		m.heapSort(a); //sorts the new list based on the new Arriving Time inputed
		
				
		
		System.out.println("The updated list is: ");
		
		//loop to print updated sorted list
		for(int i = 0; i < m.customers.size();i++)
		{
			Customer temp = m.customers.get(i);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")");
		}
		
		System.out.println();
		//Test ability to change name, age, and purposes for a customer
		System.out.println("Enter new name for customer 5: ");
		m.customers.get(4).setName();
		System.out.println("Enter new age for customer 5: ");
		m.customers.get(4).setAge();
		System.out.println("Enter new purposes for customer 5(Using commas only please): ");
		m.customers.get(4).setPurposes();
		
		System.out.println("The updated list is: ");
		
		//loop to print updated sorted list
		for(int i = 0; i < m.customers.size();i++)
		{
			Customer temp = m.customers.get(i);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")");
		}
		 
 */
		
		
		
		
		
		
		
//**TESTS** using Heap Priority Que to store 20 customers based on their arriving time && based on Waiting Score
		
		m2.customers.add(one);
		m2.customers.add(two);
		m2.customers.add(three);
		m2.customers.add(four);
		m2.customers.add(five);
		m2.customers.add(six);
		m2.customers.add(seven);
		m2.customers.add(eight);
		m2.customers.add(nine);
		m2.customers.add(ten);
		m2.customers.add(eleven);
		m2.customers.add(twelve);
		m2.customers.add(thirteen);
		m2.customers.add(fourteen);
		m2.customers.add(fifteen);
		m2.customers.add(sixteen);
		m2.customers.add(seventeen);
		m2.customers.add(eighteen);
		m2.customers.add(nineteen);
		m2.customers.add(twenty);
		int size = m2.customers.size()	;	
		
		m2.buildMaxHeap(a); //build the maxHeap by comparing Arriving Time

		//SORTS AND PRINTS BY ARRIVING TIME
/*		 
		//loop to print maxHeap structure
		System.out.println("The ArrayList with the MaxHeap Structure Sorted by Arriving Time is: ");
		for(int i = 0; i <size; i++)
		{
			Customer temp =m2.customers.get(i);
		System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());

		}
		System.out.println();
		System.out.println("This Priority Que sorted by Arriving Time is: ");
		for(int i = 0; i < size;i++)
		{
			Customer temp = m2.heapExtractMax(a);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());
		}
*/
		 
			
		
		//SORTS AND PRINTS BASED ON WAITING SCORE
/*		 
		m2.buildMaxHeap(w); //build the maxHeap by comparing Waiting Score
		System.out.println("The ArrayList with the MaxHeap Structure Sorted by WaitingScore is: ");
		for(int i = 0; i <size; i++)
		{
			Customer temp =m2.customers.get(i);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());

		}
		
		System.out.println();
		//loop to print Priority Que
		System.out.println("This Priority Que sorted by WaitingScore is: ");
		for(int i = 0; i < size;i++)
		{
			Customer temp = m2.heapExtractMax(w);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());
		}
*/
				

		
		
//**TEST** ability to get and calculate waiting score
		
		//System.out.println(one.getWaitingScore());
		
		
//**TESTS** heap underflow if the heap is empty
		
		//Customer temp1 = m3.heapExtractMax(a); 
		
		
		
//**TESTS** maxHeapInsert based on WaitingScore	
/*		
		m3.maxHeapInsert(one,w);
		m3.maxHeapInsert(two,w);
		m3.maxHeapInsert(three,w);
		m3.maxHeapInsert(four,w);
		m3.maxHeapInsert(five,w);
		m3.maxHeapInsert(six,w);
		m3.maxHeapInsert(seven,w);
		m3.maxHeapInsert(eight,w);
		m3.maxHeapInsert(nine,w);
		m3.maxHeapInsert(ten,w);
		m3.maxHeapInsert(eleven,w);
		m3.maxHeapInsert(twelve,w);
		m3.maxHeapInsert(thirteen,w);
		m3.maxHeapInsert(fourteen,w);
		m3.maxHeapInsert(fifteen,w);
		m3.maxHeapInsert(sixteen,w);
		m3.maxHeapInsert(seventeen,w);
		m3.maxHeapInsert(eighteen,w);
		m3.maxHeapInsert(nineteen,w);
		m3.maxHeapInsert(twenty,w);
		int n = m3.customers.size();
	
		//Prints maxHeap Structure
		System.out.println("The ArrayList with the MaxHeap Structure is: ");
		for(int i = 0; i < m3.customers.size();i++)
		{
			Customer temp = m3.customers.get(i);
			
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());
		}
		
		//Prints priority que 
		System.out.println();
		System.out.println("This list sorted by Arriving time is: ");
		for(int i = 0; i < n;i++)
		{
			Customer temp = m3.heapExtractMax(w);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());
		}
*/	
		
		
		
		
		
		
//**TEST** ability to look at max customer in the list		
/*		
		m4.maxHeapInsert(one,w);
		m4.maxHeapInsert(two,w);
		m4.maxHeapInsert(three,w);
		m4.maxHeapInsert(four,w);
		m4.maxHeapInsert(five,w);
		m4.maxHeapInsert(six,w);
		m4.maxHeapInsert(seven,w);
		m4.maxHeapInsert(eight,w);
		m4.maxHeapInsert(nine,w);
		m4.maxHeapInsert(ten,w);
		m4.maxHeapInsert(eleven,w);
		m4.maxHeapInsert(twelve,w);
		m4.maxHeapInsert(thirteen,w);
		m4.maxHeapInsert(fourteen,w);
		m4.maxHeapInsert(fifteen,w);
		m4.maxHeapInsert(sixteen,w);
		m4.maxHeapInsert(seventeen,w);
		m4.maxHeapInsert(eighteen,w);
		m4.maxHeapInsert(nineteen,w);
		m4.maxHeapInsert(twenty,w);
		Customer max = m4.heapExtractMax(w);
		System.out.println("The max is: ");
		System.out.println(max.getArrivingTime() + " " + max.getName() + " " + max.getAge() + " (" + max.getPurposes() + ")" + " WaitingScore: "+max.getWaitingScore());
*/	
		
		
		
		
		
/**TESTS** Increasing Key based on user inputed waiting score		
		m5.maxHeapInsert(one,w);
		m5.maxHeapInsert(two,w);
		m5.maxHeapInsert(three,w);
		m5.maxHeapInsert(four,w);
		m5.maxHeapInsert(five,w);
		m5.maxHeapInsert(six,w);
		m5.maxHeapInsert(seven,w);
		m5.maxHeapInsert(eight,w);
		m5.maxHeapInsert(nine,w);
		m5.maxHeapInsert(ten,w);
		m5.maxHeapInsert(eleven,w);
		m5.maxHeapInsert(twelve,w);
		m5.maxHeapInsert(thirteen,w);
		m5.maxHeapInsert(fourteen,w);
		m5.maxHeapInsert(fifteen,w);
		m5.maxHeapInsert(sixteen,w);
		m5.maxHeapInsert(seventeen,w);
		m5.maxHeapInsert(eighteen,w);
		m5.maxHeapInsert(nineteen,w);
		m5.maxHeapInsert(twenty,w);
		int z = m5.customers.size();
		//Loop to print current heap structure
		System.out.println("The ArrayList with the MaxHeap Structure is: ");
		for(int i = 0; i < m5.customers.size();i++)
		{
			Customer temp = m5.customers.get(i);
			
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());
		}
		
		//Set new Waiting Score and Increase its key
		System.out.println("Type in the new WaitingScore for the last customer: ");
		m5.customers.get(z-1).setWaitingScore();
		m5.heapIncreaseKey(z-1, w);
		
		System.out.println();
		//Loop to print new heap structure
		System.out.println("The updated ArrayList with the MaxHeap Structure is: ");
		for(int i = 0; i < m5.customers.size();i++)
		{
			Customer temp = m5.customers.get(i);
			
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());
		}
		
		
*/
		
	}
	
	public static void displayOptions()
	{
		System.out.println("What would you like to do? \n 1) Sort the Customer List using HeapSort based on arriving time \n "
				+ "2) Change a customer's name, arriving time, age, and visiting purposes \n "
				+ "3) Build a priority que based on waiting score \n "
				+ "4) Insert a customer into the priority que \n "
				+ "5) View the first customer in the que \n "
				+ "6) Increase the priority/waiting score of a customer \n "
				+ "7) Exit Application \n "
				+ "NOTE: For applications 4-6, please build the priority que first so that everything works as intended \n"
				+ "Please enter a number: \n");
		
		int input = scanner.nextInt();
		if(input == 1){
			heapSortDisplay(m);
		}
		else if(input == 2){
			changeCustomer();
		}
		else if(input == 3){
			showPrioQue();
		}
		else if(input == 4){
			insertPrioQue();
		}
		else if(input == 5){
			viewFirstCustomer();
		}
		else if(input ==6) {
			increaseWaitingScore();
		}
		else if(input == 7) {
			System.out.println("Thank you for using the DMVQue Application");
			System.exit(0);
		}
		else {
			System.out.println("Invalid number, relaunch program");
			System.exit(0);
		}
	}
	
	//DISPLAYS THE HEAP SORTED USING ARRIVING TIME
	public static void heapSortDisplay(MaxHeap m)
	{
		m.heapSort(a); //Sorts the list based on Arriving Time
		System.out.println("The heapSorted list based on Arriving Time is:\n");
		
		//loop to print out sorted list
		for(int i = 0; i < m.customers.size();i++)
		{
			Customer temp = m.customers.get(i);
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")");
		}
				
		System.out.println();	
		displayOptions();
		
	}
	
	//ALLOWS THE USER TO CHANGE A CUSTOMERS PARAMETERS, AND UPDATES THE HEAP ACCORDINGLY
	public static void changeCustomer()
	{
		System.out.println("Which Customer would you like to change: ");
		int in = scanner.nextInt();
		//checks if valid
		if(in < 1 || in> m.customers.size())
		{
			System.out.println("Error Invalid Customer");
			displayOptions();
		}
		System.out.println("Choose What to change \n "
				+ "1)Arriving time \n "
				+ "2)Name \n "
				+ "3)Age \n "
				+ "4)New Purposes");
		
		int choice = scanner.nextInt();
		//choice of what to update
		if(choice == 1)
		{
			System.out.println("Enter new arriving time for customer" + in);
			m.customers.get(in-1).setArrivingTime();
		}
		else if(choice == 2) {
			System.out.println("Enter new name for customer"+in);
			m.customers.get(in-1).setName();
		}
		else if(choice == 3)
		{
			System.out.println("Enter new age for customer"+in);
			m.customers.get(in-1).setAge();
		}
		else if(choice ==4)	
		{
			System.out.println("Enter new purposes for customer 5(Using commas only please): ");
			m.customers.get(in-1).setPurposes();
		}
		else {
			System.out.println("Invalid choice");
			displayOptions();
		}
		
			m.heapSort(a);
			System.out.println("The updated list is: ");
			
			//loop to print updated sorted list
			for(int i = 0; i < m.customers.size();i++)
			{
				Customer temp = m.customers.get(i);
				System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")");
			}
			System.out.println();
			displayOptions();
		
	}
	
	//BUILDS AND SHOWS A PRIORITY QUE FIRST BUILD BY ARRIVING TIME THEN BY WAITING SCORE
	public static void showPrioQue()
	{
		m.buildMaxHeap(a);
		m.buildMaxHeap(w);
		System.out.println();
		//loop to print Priority Que
		System.out.println("This Priority Que sorted by WaitingScore is: ");
		int size = m.customers.size();
		cus = new Customer[size]; //stores the values to rebuild the heap
		for(int i = 0; i < size;i++)
		{
			Customer temp = m.heapExtractMax(w);
			cus[i] = temp;
			System.out.println(temp.getArrivingTime() + " " + temp.getName() + " " + temp.getAge() + " (" + temp.getPurposes() + ")" + " WaitingScore: "+temp.getWaitingScore());
		}
		
		//re-add evrything to heap
		for(int i = 0; i < cus.length; i++)
		{
			m.maxHeapInsert(cus[i], w);
		}
		System.out.println();
		displayOptions();
	}
	
	//USER INSERTS A NEW CUSTOMER INTO THE PRIOQUE
	public static void insertPrioQue()
	{
		Customer temp = new Customer(gen.nextInt(9999),null, 0, "1");
		for( int i = 0 ; i < 3; i ++)
		{
			buildCustomerParam(temp);
		}
		
		m.maxHeapInsert(temp, w); //insert based on waiting score
		
		
		System.out.println("Here is the updated PrioQue \n");
		int size = m.customers.size();
		for(int i = 0; i < size;i++)
		{
			Customer tempo = m.heapExtractMax(w);
			System.out.println(tempo.getArrivingTime() + " " + tempo.getName() + " " + tempo.getAge() + " (" + tempo.getPurposes() + ")" + " WaitingScore: "+tempo.getWaitingScore());
		}
		
		//rebuild the heap
		for(int i = 0; i < cus.length; i++)
		{
			m.maxHeapInsert(cus[i], w);
		}
		displayOptions();
	}
	
	//VIEWS THE FIRST CUSTOMER IN THE PRIORITY QUE
	public static void viewFirstCustomer()
	{
		Customer max = m.heapExtractMax(w);
		System.out.println("The max is: ");
		System.out.println(max.getArrivingTime() + " " + max.getName() + " " + max.getAge() + " (" + max.getPurposes() + ")" + " WaitingScore: "+max.getWaitingScore());
		System.out.println("They are now removed from the list \n");
		displayOptions();
	}
	
	//FUNCTION TO INCREASE CUSTOMERS PRIORITY BASED ON USER INPUTED WAITING SCORE
	public static void increaseWaitingScore()
	{
		System.out.println("Choose which customer to increase priority");
		int c = scanner.nextInt();
		//checks validity
		if(c < 1 || c > cus.length)
		{
			System.out.println("INvalid customer");
			displayOptions();
		}
		System.out.println("Type in the new WaitingScore for the last customer: ");
		m.customers.get(c-1).setWaitingScore();
		m.heapIncreaseKey(c-1, w); 
		m.buildMaxHeap(w);
		System.out.println("The Updated Que is \n");
		int size = m.customers.size();
		for(int i = 0; i < size;i++)
		{
			Customer tempo = m.heapExtractMax(w);
			System.out.println(tempo.getArrivingTime() + " " + tempo.getName() + " " + tempo.getAge() + " (" + tempo.getPurposes() + ")" + " WaitingScore: "+tempo.getWaitingScore());
		}
		//re-add everything to the heap
		for(int i = 0; i < cus.length; i++)
		{
			m.maxHeapInsert(cus[i], w);
		}
		//displayOptions();
		System.out.println();
		displayOptions();
	}
	
	//function thats helps construct a new customer based on user input
	public static void buildCustomerParam(Customer c)
	{
		System.out.println("Here is the current customer: " + c.getArrivingTime() + " " + c.getName() + " " + c.getAge() + " (" + c.getPurposes() + ")" + " WaitingScore: "+c.getWaitingScore()
		+ "\n Choose what parameter to construct: \n "
		+ "1)Name \n "
		+ "2)Purposes \n "
		+ "3)Age \n "
		+ "4)Return to application options");
		
		int choice = scanner.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter new name for customer");
			c.setName();
		}

		else if(choice == 2)
		{
			System.out.println("Enter new purposes for customer 5(Using commas only please): ");
			c.setPurposes();
		}
		else if(choice == 3) {
			System.out.println("Enter new age for customer");
			c.setAge();
			scanner.nextLine();
		}
		else if(choice ==4)	
		{
			displayOptions();
		}
		else {
			System.out.println("Invalid choice");
			displayOptions();
		}
	}

}
		







//ArrivingTime class allows us to compare the Arriving Time between different customers
class ArrivingTime implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getArrivingTime() - o2.getArrivingTime();
	}
	
}

//WaitingScore class allows us to compare the WaitingScore between different customers
class WaitingScore implements Comparator<Customer>
{

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getWaitingScore() - o2.getWaitingScore();
	}
	
}
