package extra;

import javax.swing.JOptionPane;

public class remarkeble {
	public static void main(String[] args) {

		String dave = " to do code";

		String andy = "to  have the ability to be good at fortnite";

		String Input = JOptionPane.showInputDialog("enter a name");

		if (Input.equals("andy")) {
			JOptionPane.showMessageDialog(null, andy);

		}
		if (Input.equals("dave")) {
			JOptionPane.showMessageDialog(null, dave);
		}

	}
}