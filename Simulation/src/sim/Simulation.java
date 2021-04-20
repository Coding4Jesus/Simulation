package sim;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Simulation {
	private JFrame frame;
	private JPanel panel;
	private JButton[] grid;
	private JButton start;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10 ,l11, l12, wl, rl, space;
	private String Grass, Rabbit, Wolf;
	private JTextField w1, w2, w3, w4, w5, w6, r1, r2, r3, r4, r5, r6;
	
	public Simulation() {
		Grass = "G";
		Rabbit = "R";
		Wolf = "W";
		
		frame = new JFrame("Rabbit & Wolf Sim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null);
		Wolves wolves = new Wolves();
		
		panel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		wl = new JLabel("WOLF PARAMETERS");   //builds the labels and text boxes for changing the parameters
		c.gridx = 1;
		c.gridy = 0;
		panel.add(wl, c);
		
		w1 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 1;
		panel.add(w1, c);
		
		l1 = new JLabel("# of wolves at start ");
		c.gridx = 1;
		c.gridy = 1;
		panel.add(l1, c);
		
		w2 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 2;
		panel.add(w2, c);
		
		l2 = new JLabel("Metabolism rate");
		c.gridx = 1;
		c.gridy = 2;
		panel.add(l2, c);
		
		w3 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 3;
		panel.add(w3, c);
		
		l3 = new JLabel("Amount of food at start ");
		c.gridx = 1;
		c.gridy = 3;
		panel.add(l3, c);
		
		w4 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 4;
		panel.add(w4, c);
		
		l4 = new JLabel("Max food allowed");
		c.gridx = 1;
		c.gridy = 4;
		panel.add(l4, c);
		
		w5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 5;
		panel.add(w5, c);
		
		l5 = new JLabel("Max age");
		c.gridx = 1;
		c.gridy = 5;
		panel.add(l5, c);
		
		w6 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 6;
		panel.add(w6, c);
		
		l6 = new JLabel("Reproduction probability ");
		c.gridx = 1;
		c.gridy = 6;
		panel.add(l6, c);
		
		space = new JLabel("   ");
		c.gridx = 1;
		c.gridy = 7;
		panel.add(space, c);
		
		rl = new JLabel("RABBIT PARAMETERS");
		c.gridx = 1;
		c.gridy = 8;
		panel.add(rl, c);
		
		r1 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 9;
		panel.add(r1, c);
		
		l7 = new JLabel("# of rabbits at start ");
		c.gridx = 1;
		c.gridy = 9;
		panel.add(l7, c);
		
		r2 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 10;
		panel.add(r2, c);
		
		l8 = new JLabel("Metabolism rate");
		c.gridx = 1;
		c.gridy = 10;
		panel.add(l8, c);
		
		r3 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 11;
		panel.add(r3, c);
		
		l9 = new JLabel("Amount of food at start ");
		c.gridx = 1;
		c.gridy = 11;
		panel.add(l9, c);
		
		r4 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 12;
		panel.add(r4, c);
		
		l10 = new JLabel("Max food allowed");
		c.gridx = 1;
		c.gridy = 12;
		panel.add(l10, c);
		
		r5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 13;
		panel.add(r5, c);
		
		l11 = new JLabel("Max age");
		c.gridx = 1;
		c.gridy = 13;
		panel.add(l11, c);
		
		r6 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 14;
		panel.add(r6, c);
		
		l12 = new JLabel("Reproduction probability ");
		c.gridx = 1;
		c.gridy = 14;
		panel.add(l12, c);
		
		start = new JButton("Next Day");
		
		grid = new JButton[100];
		String b[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
				    "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40",
				    "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60",
				    "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80",
				    "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"};
		
		for(int i = 0; i<grid.length; i++) {  //builds the grid for the simulation 
			grid[i] = new JButton(" ");
			c.gridx = i+4;
			c.gridy = 2;
			if (i > 9) {
				c.gridx = i-6;
				c.gridy = 3;
			}
			if (i > 19) {
				c.gridx = i - 16;
				c.gridy = 4;
			}
			if (i > 29) {
				c.gridx = i - 26;
				c.gridy = 5;
			}
			if (i > 39) {
				c.gridx = i - 36;
				c.gridy = 6;
			}
			if (i > 49) {
				c.gridx = i - 46;
				c.gridy = 7;
			}
			if (i > 59) {
				c.gridx = i - 56;
				c.gridy = 8;
			}
			if (i > 69) {
				c.gridx = i - 66;
				c.gridy = 9;
			}
			if (i > 79) {
				c.gridx = i - 76;
				c.gridy = 10;
			}
			if (i > 89) {
				c.gridx = i - 86;
				c.gridy = 11;
	}
			panel.add(grid[i], c);
			System.out.println(i);
		}
			
			
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(w1.getText() != "") {
				wolves.changeW1(Integer.parseInt(w1.getText()));	//converts all input parameters and inserts them into the wolves class
				}													//also checks for no empty text boxes
				if(w2.getText() != "") {
				wolves.changeW2(Integer.parseInt(w2.getText()));
				}
				if(w3.getText() != "") {
				wolves.changeW3(Integer.parseInt(w3.getText()));
				}
				if(w4.getText() != "") {
				wolves.changeW4(Integer.parseInt(w4.getText()));
				}
				if(w5.getText() != "") {
				wolves.changeW5(Integer.parseInt(w5.getText()));
				}
				if(w6.getText() != "") {
				wolves.changeW6(Integer.parseInt(w6.getText()));
				}
				
			}
		});
		c.gridx = 3;
		c.gridy = 0;
		panel.add(start, c);
		
		
		frame.setContentPane(panel);
		
		frame.setVisible(true);
		
	}


	public static void main(String[] args) {
		Simulation run = new Simulation();

	}
	
	public static class Wolves {
		private int numberW1, metabolW2, startFW3, maxFW4, maxAgeW5, chancetoXW6;		//the 6 variables I think we'll need
		public Wolves() {																		//numbered to keep them in mind more easily
			numberW1 = 10;	//initial values
			metabolW2 = 10;	//just placeholder
			startFW3 = 50;
			maxFW4 = 150;
			maxAgeW5 = 50;
			chancetoXW6 = 75;
		}
		public int changeW1(int placehold) { 
			numberW1 = placehold;				//they all change the initial values
			return(numberW1);					//and return them
		}
		public int changeW2(int placehold) {
			metabolW2 = placehold;
			return(metabolW2);
		}
		public int changeW3(int placehold) {
			startFW3 = placehold;
			return(startFW3);
		}
		public int changeW4(int placehold) {
			maxFW4 = placehold;
			return(maxFW4);
		}
		public int changeW5(int placehold) {
			maxAgeW5 = placehold;
			return(maxAgeW5);
		}
		public int changeW6(int placehold) {
			int a;
			chancetoXW6 = placehold;
			a = chancetoXW6/100;
			return(a);
		}
	}
}
