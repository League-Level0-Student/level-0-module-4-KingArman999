package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String digits = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int using Integer.parseInt()
int boi = Integer.parseInt(digits);
		// Ask the user how many dimes they have, and convert their answer
String poi = JOptionPane.showInputDialog(null, "How many dimes do you have?");
int goi = Integer.parseInt(poi);
		// Ask the user how many quarters they have, and convert their answer
String koi = JOptionPane.showInputDialog(null, "How many quarters do you have?");
int loi = Integer.parseInt(koi);
		// Calculate how much money the user has and save it in a double variable 
double soi = 0.0;
soi += boi*0.5;


		// Tell the user how much money they have

	}
}

