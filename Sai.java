import java.util.Scanner;

import javax.swing.*;
public class Sai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name2 =JOptionPane.showInputDialog("what is your name ?");
		JOptionPane.showMessageDialog(null,"your name is "+name2);
		
		int age =Integer.parseInt(JOptionPane.showInputDialog("enter your age ? "));
		JOptionPane.showMessageDialog(null,"hai your age "+age);

		int name=(JOptionPane.showConfirmDialog(null,"r u v?"));
		
		JOptionPane.showMessageDialog(null,"ypu are"+name);
	}

}
