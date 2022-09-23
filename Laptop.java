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
    private double graphics;
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
        ram = r.nextInt(3) + 1;
        hdd = r.nextInt(2048) + 1;
        weight = r.nextInt(6) + 1;
        battery = r.nextInt(9) + 1;
        price = r.nextInt(2000) + 1;
        cpu = r.nextInt(3) + 1;
        graphics = r.nextInt(2);
        screen = r.nextInt(17) + 1;
        laptopScore = (2 * cpu / cpuMax) + (2 * ram / ramMax) + (1 * hdd / hddMax) + (graphics) + (1 * screen / screenMax) + (1 * weight / weightMax) + (1 * battery / batteryMax) + (1 * price / priceMax);
    }

    public double getLaptopScore(){
        return laptopScore;
    }
    
    @Override
    public int compareTo(Laptop l){
        //comparing the laptop scores...will do smallest to greatest value
        
         if (this.laptopScore < l.getLaptopScore()){
            return -1;
        } else if (this.laptopScore > l.getLaptopScore()){
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString(){
        String graphicsValue;
        if (graphics == 1){
            graphicsValue = "yes";
        } else {
            graphicsValue = "no";
        }
        return "CPU: " + cpu + " RAM: " + ram + " HDD: " + hdd + " SCREEN: " + screen + " WEIGHT: " + weight + " BATTERY: " + battery + " GRAPHICS: " + graphicsValue +" PRICE: " + price + " SCORE: " + String.format("%.2f", laptopScore);
    }
    
}