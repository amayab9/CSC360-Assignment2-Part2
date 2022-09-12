/*
Date: 9/11/2022
Author: Amaya Bryant
Assignment: 2 part 2
Purpose: learning how to implement cloneable and comparable
Course: OOP2 - CSC 360
*/
import java.util.Random;
public class Laptop implements Comparable<Laptop>{
    
    private double ram;
    private double hdd;
    private double weight;
    private double battery;
    private double price;
    private double cpu;
    private double screen;
    private boolean graphics;
    private double laptopScore;

    final double ramMax = 32;
    final double hddMax = 2048;
    final double weightMax = 6;
    final double batteryMax = 9;
    final double priceMax = 2000;
    final double cpuMax = 3.0;
    final double screenMax = 17.0; 

    public Laptop(){ 
        Random r = new Random();
        

        //laptopScore = (2 * cpu / cpuMax) + (2 * ram / ramMax) + (1 * hdd / hddMax) + (graphics) + (1 * screen / screenMax) + (1 * weight / weightMax) + (1 * battery / batteryMax) + (1 * price / priceMax);

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