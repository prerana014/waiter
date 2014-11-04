package Hotelmanagement;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Categories extends JFrame {

	private JButton Breakbtn;
	private JButton Lunchbtn;
	private JButton Drinksbtn;
	private JButton Dinnerbtn;
	private JButton Snacksbtn;
	
	
	public Categories() {
		
		JPanel display= new JPanel();
		display.setLayout(new BorderLayout());
		display.setLayout(new GridLayout(3, 1));
		display.setPreferredSize(new Dimension(100,350));
		String[] buttons= { "Breakfast ", "Lunch", " Drinks","Dinner","Snacks"};
		
		for(int i= 0; i <5; i++) {
			display.add(new JButton(buttons[i]));
		}
		
add(display);
setSize(350,300);
setTitle("Categories");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);



	
		
	}
	
	
	
}
