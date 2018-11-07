package Arrays;

import java.util.ArrayList; //!!!!!!!!!!!!!!!!! 

public class Arrays {
//	private int[] myNumbers;//type
	private ArrayList<String> groceryList = new ArrayList<String>();//class w/ constructor
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	}
	
	public void printGroceryList( ) {
		System.out.println("you have " + groceryList.size() + " items in your grocery list");
		for(int i=0; i<groceryList.size(); i++){
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	public void modifyGroceryItem(int position, String newItem) {
		groceryList.set(position,  newItem);
		System.out.println(position + "modified");
	}
	
	public void removeGroceryItem(int position) {
		String theItem = groceryList.get(position);
		groceryList.remove(position);
		System.out.println(theItem + " has been removed");
	}
	public String findItem(String searchItem) {
//		boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		return groceryList.get(position);
	}
		
}
