package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        String[] num = new String[4];
        num[0] = "hello";
        for(int i = 0; i < num.length;i++) {
            System.out.println(num[i]);
        }

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - Print menu options.");
        System.out.println("\t 1 - Print the lists of items.");
        System.out.println("\t 2 - Add an item to the item list.");
        System.out.println("\t 3 - Modify an item in the list.");
        System.out.println("\t 4 - Remove an item in the list.");
        System.out.println("\t 5 - Search for an item in the list.");
        System.out.println("\t 6 - Quit the application.");
    }


    public static void addItem() {
        System.out.println("Please enter the grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter current item ");
        String currentItem = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newName = scanner.nextLine();
        groceryList.modifyGroceryItem(currentItem, newName);
    }

    public static void removeItem() {
        System.out.println("Enter the item you want to remove");
        String num = scanner.nextLine();

        groceryList.remove(num);
    }


    public static void searchForItem() {
        System.out.println("Enter the item to look for ");
        String item = scanner.nextLine();
        if(groceryList.onFile(item)) {
            System.out.println("Found " + item + " in our grocery list");
        }else {
            System.out.println(item + " is not in the shopping list");
        }
    }

}
