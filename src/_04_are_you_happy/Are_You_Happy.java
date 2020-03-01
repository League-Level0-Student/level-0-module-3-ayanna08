package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Are_You_Happy {
	
	public static void main(String[] args) {
		
		String input= JOptionPane.showInputDialog("Are you happy?");
	
		
		if(input.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing!");
		}
		
		if(input.equals("no")) {
			input= JOptionPane.showInputDialog("Do you want to be happy?");
			if(input.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Then change something");
			}
			if(input.equals("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
			}
		}
		
		
		
		
	}
}
