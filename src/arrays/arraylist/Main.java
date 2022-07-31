package arrays.arraylist;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printedInstrcutions();
        while (!quit){
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 0:
                    printedInstrcutions();
                    break;
                case 1:
                    groceryList.printedGroceryList();
                    break;
                case 2:
                    addGroceryItem();
                    break;
                case 3:
                    modifyGroceryItem();
                    break;
                case 4:
                    removeGroceryItem();
                    break;
                case 5:
                    findGroceryItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printedInstrcutions(){
        System.out.println("\nPress");
        System.out.println("\t0 - to print choice options");
        System.out.println("\t1 - to print the list of grocery items");
        System.out.println("\t2 - to add an item in the list");
        System.out.println("\t3 - to modify an item in the list");
        System.out.println("\t4 - to remove an item from the list");
        System.out.println("\t5 - to search for an item in the list");
        System.out.println("\t6 - to quit the application");
    }

    public static void addGroceryItem(){
        System.out.print("\nPlease enter the grocery item: ");
        sc.nextLine();
        String itemName = sc.nextLine();
        groceryList.addGroceryItem(itemName);
    }

    public static void modifyGroceryItem(){
        System.out.print("\nEnter the item name: ");
        String currentItem = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter the replacement: ");
        String newItem = sc.nextLine();
        System.out.println("new item name " + newItem);

        groceryList.modifyGroceryItem(currentItem, newItem);
    }

    public static void removeGroceryItem(){
        System.out.print("\nEnter item name: ");
        String itemName = sc.nextLine();
        sc.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    public static void findGroceryItem(){
        System.out.print("\nEnter item name to search for: ");
        sc.nextLine();
        String itemName = sc.nextLine();
        if(groceryList.onFile(itemName)){
            System.out.println("Found '" + itemName + "' in your file");
        } else {
            System.out.println("'"+ itemName + "' not on file");
        }

    }

}
