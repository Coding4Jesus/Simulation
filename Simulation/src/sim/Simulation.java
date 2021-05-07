package sim;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Simulation {

/* 
 * Jesus on wolves
 * Jack on rabbits
 * Devin on the environment
 */

	Random r = new Random();

		
	private JFrame frame;
	private JPanel panel;
	private JButton[] grid;
	private JButton start, nextDay;
	private JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10 ,l11, l12, wl, rl, space;
	private JTextField w1, w2, w3, w4, w5, w6, r1, r2, r3, r4, r5, r6;
	
	public Simulation() {
		
		Wolves wolves = new Wolves();
		Rabbits rabbits = new Rabbits();

		frame = new JFrame("Rabbit & Wolf Sim");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(850, 850);
		frame.setLocationRelativeTo(null);
		
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
		w1.setText("10");
		
		l1 = new JLabel("# of wolves at start ");
		c.gridx = 1;
		c.gridy = 1;
		panel.add(l1, c);
		
		w2 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 2;
		panel.add(w2, c);
		w2.setText("10");
		
		l2 = new JLabel("Metabolism rate ");
		c.gridx = 1;
		c.gridy = 2;
		panel.add(l2, c);
		
		w3 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 3;
		panel.add(w3, c);
		w3.setText("50");
		
		l3 = new JLabel("Amount of food at start ");
		c.gridx = 1;
		c.gridy = 3;
		panel.add(l3, c);	
		
		w4 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 4;
		panel.add(w4, c);
		w4.setText("150");
		
		l4 = new JLabel("Max food allowed ");
		c.gridx = 1;
		c.gridy = 4;
		panel.add(l4, c);
		
		w5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 5;
		panel.add(w5, c);
		w5.setText("50");
		
		l5 = new JLabel("Max age ");
		c.gridx = 1;
		c.gridy = 5;
		panel.add(l5, c);
		
		w6 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 6;
		panel.add(w6, c);
		w6.setText("75");
		
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
		
		l8 = new JLabel("Metabolism rate ");
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
		
		l10 = new JLabel("Max food allowed ");
		c.gridx = 1;
		c.gridy = 12;
		panel.add(l10, c);
		
		r5 = new JTextField(10);
		c.gridx = 2;
		c.gridy = 13;
		panel.add(r5, c);
		
		l11 = new JLabel("Max age ");
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
		
		start = new JButton("Set Parameters");
		
		grid = new JButton[100];

		
		int[] grassNum;				//Array for which spots in the grid have grass
		grassNum = new int[100];	//1 if there is grass, will change to 0 when there isn't
		
		int[] rabbitNum;			//Array for which spots in the grid have rabbits
		rabbitNum = new int[100];	//0 if there is no rabbit, will change to 1 when there is
		
		int[] wolfNum;				//Array for which spots in the grid have wolves
		wolfNum = new int[100];		//0 if there is no wolf, will change to 1 when there is
		
		
					
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
		}
			

			System.out.println(w1.getText());			//debugging
			if(Integer.parseInt(w1.getText()) == 10) {	//
				System.out.println("EEEEE");			//
			}											//
			else {										//
				System.out.println("BBB");				//
			}											//debugging
		
		start.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				for(int i = 0; i<grid.length; i++) {
					grassNum[i] = 1;
					wolfNum[i] = 0;
					rabbitNum[i] = 0;
				}
				
				int Space;		//For storing the random int for the space an animal is placed
				
				if(Integer.parseInt(w1.getText()) > 0) {		
					wolves.WolAlter1(Integer.parseInt(w1.getText()));	//inserts them into the wolves class
					//wolves.makeWolves(wolves.WolSend1());
					System.out.println(wolves.WolSend1());
				}else {													//also checks for no empty text boxes
					System.out.println("try again1");
				}											 			//calls method to create wolves
				if(Integer.parseInt(w2.getText())	> 0) {
					wolves.WolAlter2(Integer.parseInt(w2.getText()));
					System.out.println(wolves.WolSend2());
				}else {
					System.out.println("try again2");
				}
				if(Integer.parseInt(w3.getText())	> 0) {
					wolves.WolAlter3(Integer.parseInt(w3.getText()));
					System.out.println(wolves.WolSend3());
				}else {
					System.out.println("try again3");
				}
				if(Integer.parseInt(w4.getText())	> 0) {
					wolves.WolAlter4(Integer.parseInt(w4.getText()));
					System.out.println(wolves.WolSend4());
				}else {
					System.out.println("try again4");
				}
				if(Integer.parseInt(w5.getText())	> 0) {
					wolves.WolAlter5(Integer.parseInt(w5.getText()));
					System.out.println(wolves.WolSend5());
				}else {
					System.out.println("try again5");
				}
				if(Integer.parseInt(w6.getText())	> 0) {
					wolves.WolAlter6(Integer.parseInt(w6.getText()));
					System.out.println(wolves.WolSend6());
				}else {
					System.out.println("try again6");
				}
				
				for(int i = 0; i<grid.length; i++) {		//Sets all buttons to g for grass
					grid[i].setText("g");			
				}
				
				for(int i = 0; i<wolves.WolSend1(); i++) {		//Randomly places W for each wolf
					Space = r.nextInt(99-0+1)+0;
					if(grid[Space].getText().equals("W")) {		
						i = i-1;
					}else {
						grid[Space].setText("W");
						wolfNum[Space] = 1;			//Sets a 1 in the place where a wolf is
					}
					
				}	
				
				for(int i = 0; i<rabbits.RabSend1(); i++) {		//Randomly places R for each rabbit
					Space = r.nextInt(99-0+1)+0;
					
					if(grid[Space].getText().equals("W") || grid[Space].getText().equals("R")) {
						i = i-1;
					}else {
						grid[Space].setText("R");
						rabbitNum[Space] = 1;		//Sets a 1 in the place where a rabbit is
					}

				}
			
				
			}
		});
		
			
		c.gridx = 3;
		c.gridy = 0;
		panel.add(start, c);
		
		nextDay = new JButton("Next Day");

		nextDay.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				int[] grassNum2 = rabbits.RabEat(rabbitNum, grassNum);
				
				for(int i = 0; i<grid.length; i++) {
					
					if (grid[i].equals("g")) {
						if (grassNum2[i] == 0) {
							grid[i].setText(" ");
							}
					}
						
				}
			}
			
		});
		
		c.gridx = 3;
		c.gridy = 1;
		panel.add(nextDay, c);
		
		frame.setContentPane(panel);
		
		frame.setVisible(true);
		
	
	}

	public static void main(String[] args) {

		Simulation run = new Simulation();
		
	}
	
	public static class Wolves {
		private int WolNum1, WolMeta2, WolFS3, WolFM4, WolOld5, WolChance6;		//the 6 variables I think we'll need
		private static Object wolvs[];
		public Wolves() {														//numbered to keep them in mind more easily
			WolNum1 = 10;	//initial values
			WolMeta2 = 10;	//just placeholder
			WolFS3 = 50;
			WolFM4 = 150;
			WolOld5 = 50;
			WolChance6 = 75;
		}
		public void makeWolves(int n) {
			for (int i = 0; i < n; ++i) {
				wolvs[i] = new Wolves();
			}
		}
		public int WolAlter1(int placehold) { 
			WolNum1 = placehold;				//they all change the initial values
			return(WolNum1);					//and return them
		}
		public int WolAlter2(int placehold) {
			WolMeta2 = placehold;
			return(WolMeta2);
		}
		public int WolAlter3(int placehold) {
			WolFS3 = placehold;
			return(WolFS3);
		}
		public int WolAlter4(int placehold) {
			WolFM4 = placehold;
			return(WolFM4);
		}
		public int WolAlter5(int placehold) {
			WolOld5 = placehold;
			return(WolOld5);
		}
		public double WolAlter6(int placehold) {
			double a;
			WolChance6 = placehold;
			a = WolChance6/100;
			return(a);
		}
		public int WolSend1() { 				
			return(WolNum1);					//just return them
		}
		public int WolSend2() {
			return(WolMeta2);
		}
		public int WolSend3() {			
			return(WolFS3);
		}
		public int WolSend4() {			
			return(WolFM4);
		}
		public int WolSend5() {
			return(WolOld5);
		}
		public double WolSend6() {
			double a;
			a = WolChance6/100;
			return(a);
		}
		
	}
	
	public static class Rabbits {
		
		public static int RabNum1, RabMeta2, RabFS3, RabFM4, RabOld5, RabChance6, RabDeath7; //based on Jesus's code I should only need 6 variables, if not i can add some later
		public int[] food = new int[100], age = new int[100], FooMiss = new int[100];
		Random r = new Random();
		public Rabbits () {
			
			
			RabNum1 = 15; //placeholder value, mostly for testing stuff.      the value that stores the number of rabbits
			RabMeta2 = 10; //also a placeholder value       the value that stores the rabbit's metabolism
			RabFS3 = 15; //initial amount of food
			RabFM4 = 40; //maximum amount of food
			RabOld5 = 25; //maximum age
			RabChance6 = 50; //chance to reproduce if in proper enviroment (check the website reference to see proper enviroment)
			RabDeath7 = 0; //I'm gonna be using this for counting the amount of rabbits that have died, could display it maybe?
			
			
			for(int i = 0; i < food.length; i++) {
				
				food[i] = RabFS3;
				
			}
			for(int i = 0; i < age.length; i++) {
				
				age[i] = 0;
				
			}
            for(int i = 0; i < FooMiss.length; i++) {
				
				FooMiss[i] = 0;
				
			}
			
		}
		
		public void RabAlter1(int placehold) {
			RabNum1 = placehold;              //for changing the values
		}
		public void RabAlter2(int placehold) {
			RabMeta2 = placehold;
		}
		public void RabAlter3(int placehold) {
			RabFS3 = placehold;
		}
		public void RabAlter4(int placehold) {
			RabFM4 = placehold;
		}
		public void RabAlter5(int placehold) {
			RabOld5 = placehold;
		}
		public void RabAlter6(int placehold) {
			RabChance6 = placehold;
		}
		public int RabSend1() {
			return(RabNum1);
		}
		public int RabSend2() {
			return(RabMeta2);
		}
		public int RabSend3() {
			return(RabFS3);
		}
		public int RabSend4() {
			return(RabFM4);
		}
		public int RabSend5() {
			return(RabOld5);
		}
		public double RabSend6() {
			double b;
			b = RabChance6/100;
			return(b);
		}
		
		public int[] RabEat(int placehold[], int placehold2[]) {
			
			// everytime new day is pressed each rabbit needs to attempt to eat (random?)
			
			
			
			for(int i = 0; i < food.length; i++) {			
					
				if(placehold[i] == 1) { // RABBIT PLACEHOLD CHECK
					
					if(placehold2[i] == 1) { // GRASS PLACEHOLD CHECK
						
						placehold2[i] = 0;
						
						
						
						if(food[i] + 2 < RabFM4) {  // check to see if eating will put them over the limit
							
							food[i] = food[i] + 2;
							
							FooMiss[i] = 0; // marking down that it has ate, don't want them starving while eating
							
						}
						
					}else {
						
						FooMiss[i]++;
						
						if(FooMiss[i] == 3) {
							
							age[i] = 0;     // sets values back to default
							food[i] = RabFS3;
							RabDeath7++;   // adds a body to the kill count >:)
							
						}
						
					}
					
				}
				
			}
			
			return placehold2;
			
		}
		
		public int[] RabMove(int placehold[], int placehold2[]) {
			
			// evertime new day is pressed all rabbits must move to a random spot either to the north, east, south or west of where they just were. 
			// which direction they go is random but with higher chances to go away from wolves.
			
			int moveChan = 0; // for randomizing where the rabbits will go
			
			for(int i = 0; i < 100; i++) {
				
				
				if(placehold[i] == 1) { // making sure there's a rabbit to move
					
					if(placehold2[i] + 1 == 1|| placehold2[i] + 2 == 1) { // checking if theres a wolf to the right
						
						moveChan = r.nextInt(7-1+1)+0;
						
						if(moveChan == 1 || moveChan == 2) { // move left
							
							placehold[i] = 0;
							placehold[i - 1] = 1;
							
						}else if(moveChan == 3|| moveChan == 4) { // move up
							
							placehold[i] = 0;
							placehold[i - 10] = 1;
							
						}else if(moveChan == 5|| moveChan == 6) { // move down
							
							placehold[i] = 0;
							placehold[i + 10] = 1;
							
						}else { // move right
							
							placehold[i] = 0;
							placehold[i + 1] = 1;
							
						}
						
						
					}else if(placehold2[i] - 1 == 1|| placehold2[i] - 2 == 1) { // checking if theres a wolf to the left
						
						moveChan = r.nextInt(7-1+1)+0;
						
                        if(moveChan == 1 || moveChan == 2) { // move right
							
							placehold[i] = 0;
							placehold[i + 1] = 1;
							
						}else if(moveChan == 3|| moveChan == 4) { // move up
							
							placehold[i] = 0;
							placehold[i - 10] = 1;
							
						}else if(moveChan == 5|| moveChan == 6) { // move down
							
							placehold[i] = 0;
							placehold[i + 10] = 1;
							
						}else { // move left
							
							placehold[i] = 0;
							placehold[i - 1] = 1;
							
						}
						
					}else if(placehold2[i] + 10 == 1|| placehold2[i] + 20 == 1) { // checking if theres a wolf below
						
						moveChan = r.nextInt(7-1+1)+0;
						
                        if(moveChan == 1 || moveChan == 2) { // move left
							
							placehold[i] = 0;
							placehold[i - 1] = 1;
							
						}else if(moveChan == 3|| moveChan == 4) { // move right
							
							placehold[i] = 0;
							placehold[i + 1] = 1;
							
						}else if(moveChan == 5|| moveChan == 6) { // move up
							
							placehold[i] = 0;
							placehold[i - 10] = 1;
							
						}else { // move down
							
							placehold[i] = 0;
							placehold[i + 10] = 1;
							
						}
						
					}else if(placehold2[i] - 10 == 1|| placehold2[i] - 20 == 1) { // checking if theres a wolf above
						
						moveChan = r.nextInt(7-1+1)+0;
						
                        if(moveChan == 1 || moveChan == 2) { // move left
							
							placehold[i] = 0;
							placehold[i - 1] = 1;
							
						}else if(moveChan == 3|| moveChan == 4) { // move right
							
							placehold[i] = 0;
							placehold[i + 1] = 1;
							
						}else if(moveChan == 5|| moveChan == 6) { // move down
							
							placehold[i] = 0;
							placehold[i + 10] = 1;
							
						}else { // move up
							
							placehold[i] = 0;
							placehold[i - 10] = 1;
							
						}
						
					}else { // if theres no wolf
						
						moveChan = r.nextInt(4-1+1)+0;
						
                        if(moveChan == 1) { // move left
							
							placehold[i] = 0;
							placehold[i - 1] = 1;
							
						}else if(moveChan == 2) { // move up
							
							placehold[i] = 0;
							placehold[i - 10] = 1;
							
						}else if(moveChan == 3) { // move down
							
							placehold[i] = 0;
							placehold[i + 10] = 1;
							
						}else { // move right
							
							placehold[i] = 0;
							placehold[i + 1] = 1;
							
						}
						
					}
					
				}
				
				
			}
			
			return placehold;
			
		}
		
		public void RabAge() {
			
			// evertime new day is pressed the age goes up by 1
			
			for(int i=0; i<age.length; i++) {
				
				if(age[i] != 0) {
					
					age[i]++;
					
					if(age[i]>RabOld5) {
						
						age[i] = 0;     // sets values back to default
						food[i] = RabFS3;
						RabDeath7++;   // adds a body to the kill count >:)
						
					}
					
				}
				
			}
			
		}
		
		public void RabRepro() {
			
			// everytime a new day is pressed rabbits have a chance to reproduce if: 
			// there are two rabbits adjacent to eachother, they have eaten atleast half the max food,
			//  there are no wolves nearby and they are atleast half the max age
			
			int wahooChan = 0; // for storing repro chance during check
			
			for(int i = 0; i < 100; i++) {
				
				
				
			}
			
		}
	
	}

}
		
	
	


