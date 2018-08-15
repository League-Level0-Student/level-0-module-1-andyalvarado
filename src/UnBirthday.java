import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
	
	String input = JOptionPane.showInputDialog("enter your birthday");
	
	if (input.equals ("august 14")) { 
	
	JOptionPane.showMessageDialog(null, "happy birthday");
	
	
	}
	else {
		JOptionPane.showMessageDialog(null, "merry UNbirthday");
		
	}
}
}

