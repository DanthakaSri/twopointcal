package com.calculator;

import java.util.Scanner;

public class Calculator implements Distance, Gradient, Equation {

	public static void main(String[] args) {

		double x1,x2,y1,y2;
		
		Calculator calApp =new Calculator();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter x1 value");
		x1 = scan.nextDouble();
		
		System.out.println("please enter y1 value");
		y1 = scan.nextDouble();
		
		System.out.println("please enter x2 value");
		x2 = scan.nextDouble();
		
		System.out.println("please enter y2 value");
		y2 = scan.nextDouble();
		scan.close();
		
		calApp.calculateDistance(x1, y1, x2, y2);
		calApp.calculateEquation(x1, y1, x2, y2);
		calApp.calculateGradient(x1, y1, x2, y2);

	}

	@Override
	//Calculate Distance
	public double calculateDistance(double x1, double y1, double x2, double y2) {
		double distance;  
        distance =Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        distance =Math.round(distance* 100.0)/100.0;	// get the round number of distance
        System.out.println("\nDistance between two points = "+distance);
		return distance;
		
	}

	@Override
	//Calculate equation of straight line
	public String calculateEquation(double x1, double y1, double x2, double y2) {
		double x,y,c;
		 String equation;
		   x=Math.round((y2-y1)*100)/100;
		   y=Math.round((x2-x1)*100)/100;
		   c=Math.round(((y*y1)-(x*x1))*100)/100;
		   equation=-x+"x +"+y+"y ="+c;
		   System.out.println("\nEquation of Straight Line = "+equation);
		return equation;
		
		
	}

	@Override
	//Calculate gradient of the straight line
	public double calculateGradient(double x1, double y1, double x2, double y2) {
		double gradient;
		gradient=Math.round(((y1-y2)/(x1-x2))*100)/100;
		System.out.println("\nGradient of Straight Line = "+gradient);
		return gradient;
		
	}

}
