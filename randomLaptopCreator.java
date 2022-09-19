/*
Date: 9/11/2022
Author: Amaya Bryant
Assignment: 2 part 2
Purpose: learning how to implement cloneable and comparable
Course: OOP2 - CSC 360
*/
import java.util.Random;
import java.util.Arrays;
public class randomLaptopCreator{
    public static void main(String[] args) {

        //generate random 5 laptops
        Laptop[] laptops = new Laptop[5];

        for(int i = 0; i < 5; i++){
            laptops[i] = new Laptop(); 
            System.out.println(laptops[i]); //print out laptops
        }

        System.out.println("-----Sorted laptops-----");
        Arrays.sort(laptops); 
        for(int i = 0; i < 5; i++){ 
            System.out.println(laptops[i]); //print out laptops
        }
         

    }
}