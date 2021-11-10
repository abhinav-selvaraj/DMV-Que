//MaxHeap Class stores all the MaxHeap functions, and initializes the Customer ArrayList

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;

public class MaxHeap {
	
	public ArrayList<Customer> customers;
	
	
	//MaxHeap Constructor initializes ArrayList<Customer> customers
	public MaxHeap()
	{
		customers = new ArrayList<Customer>();
	}
	
	//heapSort alg
	public void heapSort(Comparator<Customer>c)
	{
		this.buildMaxHeap(c);
		for(int i = customers.size()-1; i >= 0; i--)
		{
			exchange(i,0);
			maxHeapify(i,0,c);
		}
	}
	
	//Builds a max heap from an unsorted array list using a comparator to compare either arriving time or waiting score
	public void buildMaxHeap(Comparator<Customer> c)
	{
		for(int i = customers.size()/2 - 1; i >=0; i--)
		{
			maxHeapify(customers.size(),i,c);
		}
	}
	
	
	
	
	
	
	//maxHeapify assumes part of the heap is already sorted
	public void maxHeapify(int size,int index, Comparator<Customer> c)
	{
		int l = left(index);
		int r = right(index);
		int largest = index;
		
		if(l <size && c.compare(customers.get(l), customers.get(largest)) > 0)
			largest = l;
		
		if(r <size && c.compare(customers.get(r), customers.get(largest)) > 0)
			largest = r;
		
		if(largest != index)
		{
			exchange(index, largest);
			maxHeapify(size,largest,c);
		}
	}
	
	
	
	//Exchanges the position of two Customers in the ArrayList customers
	public void exchange(int from, int to)
	{
		Customer c = customers.get(from);   //temporarily store Customer from index "from"
		customers.set(from, customers.get(to)); //set the value at index "from" to the value from index "to"
		customers.set(to, c);// set the value at index "to" to the temporarily stored customer
	}
	
	
	//returns the Customer with the maximum value from the heap
	public Customer heapMaximum()
	{
		//if heap is empty, throw exception
		if(customers.size() <= 0)
			throw new NullPointerException("heap underflow");
		return customers.get(0); //returns the first index of the list, which should be the max
	}
	
	//Extracts the maximum value from the heap
	public Customer heapExtractMax(Comparator<Customer>c ) 
	{
	
		Customer max = heapMaximum(); //get and store max val
		customers.set(0, customers.get(size()-1)); //set value at first index to value of last index
		customers.remove(size()-1); //remove value of last index
		
		maxHeapify(customers.size(),0,c); //maxHeapify the new heap
		
		return max; //return the max value
	}
	
	//Convenient method that returns the size of the ArrayList customers
	private int size()
	{
		return customers.size();
	}
	
	public void maxHeapInsert(Customer c, Comparator<Customer>d)
	{
		customers.add(c); //add new value at end of the list
		int index = customers.size()-1; // index of new customer
		heapIncreaseKey(index,d );
	}
	
	
	//Compares a customers arriving time or waiting score to its parent, then updates position in heap accordingly
	public void heapIncreaseKey(int index, Comparator<Customer>c)
	{
		//keeps looping until it finds the proper position in the heap
		while(index > 0 && c.compare(customers.get(index), customers.get(parent(index))) > 0)
		{
			exchange(index, parent(index)); //swap parent with current
			index = parent(index);
		}
	}
	
	
	
	//returns the index of the parent node
	public int parent(int index)
	{
		return(index -1)/2;
	}
	
	//returns the index of the left child
	public int left(int index)
	{
		return 2*index +1;
	}
	
	//returns the index of the right child
	public int right(int index)
	{
		return 2*index+2;
	}
	
	
	
}


