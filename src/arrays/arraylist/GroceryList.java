package arrays.arraylist;

import java.util.ArrayList;

public class GroceryList {
   private ArrayList<String> groceryList = new ArrayList<String>();

   public void addGroceryItem(String itemName){
       groceryList.add(itemName);
   }
   public void printedGroceryList(){
       System.out.println("You have " + groceryList.size() + " items in your grocery list");
       for (int i=0;i<groceryList.size();i++){
           System.out.println(i+1 + ". " + groceryList.get(i));
       }
   }

   public void modifyGroceryItem(String currentItem, String newItem){
       int position = findItem(currentItem);
       if(position >= 0){
           modifyGroceryItems(position, newItem);
       }
   }
   private void modifyGroceryItems(int position, String newItem){
       groceryList.set(position, newItem);
       System.out.println("Grocery item No " + (position+1) + " has been modified");
   }

   public void removeGroceryItem(String itemName){
       int position = findItem(itemName);
       System.out.println("Grocery item No " + position + " was removed successfully");

       groceryList.remove(position);
       System.out.println("Grocery item No " + position + " was removed successfully");
   }

   public int findItem(String itemName){
       return groceryList.indexOf(itemName);
   }

   public boolean onFile(String itemName){
       int position = findItem(itemName);
       if(position >= 0){
           return true;
       }
       return  false;
   }

   /*
    public String findItem(String itemName){
        int position = groceryList.indexOf(itemName);
        if(position >= 0){
            return groceryList.get(position);
        }
        return null;
    }
    */


}
