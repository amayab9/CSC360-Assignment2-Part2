/*
Date: 9/11/2022
Author: Amaya Bryant
Assignment: 2 part 2
Purpose: learning how to implement cloneable and comparable
Course: OOP2 - CSC 360
*/
public class Laptop implements Comparable<Laptop>{
    
    private int ram;
    private int hdd;
    private int weight;
    private int battery;
    private int price;
    private double cpu;
    private double screen;
    private boolean graphics;

    protected Laptop(){

    }
    
    /*@Override
    public int compareTo(Laptop l){
        //comparing the side value to see if they are the same or different
        int returnValue;
        if (){
            returnValue = -1;
        } else if (){
            returnValue = 1;
        } else {
            returnValue = 0;
        }

        return returnValue;
    }*/

    @Override
    public String toString(){
        return "CPU: " + " RAM: " + " HDD: " + " SCREEN: " + " WEIGHT: " + " BATTERY: " + " PRICE: " + " SCORE: ";
    }
    
}