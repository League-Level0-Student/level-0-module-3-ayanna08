
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 2nd";
		String dadsBirthday = "November 11th";
		String myBirthday = "April 24th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String input= JOptionPane.showInputDialog("Who's birthday do you want?");
	
		// 3. Print out what the user typed
		System.out.println(input);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if(input.equals("mom")) {
			JOptionPane.showMessageDialog(null,"Mom's bday is " +momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(input.equals("dad")) {
			JOptionPane.showMessageDialog(null,"Dad's bday is " +dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(input.equals("my")) {
			JOptionPane.showMessageDialog(null,"My's bday is " +myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday!");
		}

	} 
}
