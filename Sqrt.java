/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toptal;

/**
 *
 * @author rakib
 */
public class Sqrt {
    public static double sqrt(int number) {
	double t;
 
	double squareRoot = number / 2;
 
	do {
		t = squareRoot;
		squareRoot = (t + (number / t)) / 2;
	} while ((t - squareRoot) != 0);
 
	return squareRoot;
}
    
}
