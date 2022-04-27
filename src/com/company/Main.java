package com.company;

public class Main {

    public static void main(String[] args) {
        // Earth's gravity in m/s^2
        double gravity = -9.81;
        //initial velocity in m/s
        double initialVelocity = 0.0;
        // time in s
        double fallingTime = 10.0;
        //position in m
        double initialPosition = 0.0;
        //final position in m
        double finalPosition;
        //formulae
        finalPosition = (0.5 * (gravity*fallingTime*fallingTime) + (initialVelocity*fallingTime) + initialPosition);
        //output
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
