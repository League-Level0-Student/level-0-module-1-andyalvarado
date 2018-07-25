//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {
	public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
		String bryan = "the ability to do  nothing";
		String dave = "the ability to do code";
		String andy = "to  have the ability to be good at fortnite";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String Input = JOptionPane.showInputDialog("enter a name");
		// 3. the superpower in a pop-up, depending on the name entered.

		if (Input.equals("dave")) {
			JOptionPane.showMessageDialog(null, dave);
		}
		if (Input.equals("andy")) {
			JOptionPane.showMessageDialog(null, andy);
		}
		if (Input.equals("bryan")) {
			JOptionPane.showMessageDialog(null, bryan);
		}


	}
}
