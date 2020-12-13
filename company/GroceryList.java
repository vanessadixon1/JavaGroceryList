package com.company;


import java.util.ArrayList;


public class GroceryList {
    private ArrayList<String> grocerList = new ArrayList<>();

    public void addGroceryItem(String item) {
        grocerList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have " + grocerList.size() + " items in your grocery list");
        for(int i = 0; i < grocerList.size(); i++) {
            System.out.println((i+1) + ". " + grocerList.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String name) {
        int position = findItem(currentItem);
        if(position >=0) {
            modifyGroceryItem(position,name);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        grocerList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    private void remove(int position) {
        grocerList.remove(position);
    }

    public void remove(String item ) {
        int position = findItem(item);
        if(position >=0) {
            remove(position);
        }else {
            System.out.println(item +" is not on the list");
        }
    }
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }
        return false;
    }

    private int findItem(String searchItem) {
        return grocerList.indexOf(searchItem);
    }


}
