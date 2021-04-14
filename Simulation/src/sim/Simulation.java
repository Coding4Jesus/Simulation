package sim;
public class Simulation {
/* 
 * Jesus on wolves
 * Jack on rabbits
 * Devin on the environment
 */
	public static void main(String[] args) {
		Wolves wolves = new Wolves();			//testing
		Wolves wolves2 = new Wolves();
		System.out.print(wolves.NumberW1);
		

	}
	
	public static class Wolves {
		private static int NumberW1, Metabol2, StartF3, MaxF4, MaxAge5, ChancetoX6;		//the 6 variables I think we'll need
		public Wolves() {																//numbered to keep them in mind more easily
			NumberW1 = 10;	//initial values
			Metabol2 = 10;	//just placeholder
			StartF3 = 50;
			MaxF4 = 150;
			MaxAge5 = 50;
			ChancetoX6 = 75;
		}
		public void Change1(int placehold) { 
			NumberW1 = placehold;				//they all change the initial values
		}
		public void Change2(int placehold) {
			Metabol2 = placehold;
		}
		public void Change3(int placehold) {
			StartF3 = placehold;
		}
		public void Change4(int placehold) {
			MaxF4 = placehold;
		}
		public void Change5(int placehold) {
			MaxAge5 = placehold;
		}
		public void Change6(int placehold) {
			ChancetoX6 = placehold;
		}
		public int return1() {					//return said values
			return(NumberW1);
		}
		public int return2() {
			return(Metabol2);
		}
		public int return3() {
			return(StartF3);
		}
		public int return4() {
			return(MaxF4);
		}
		public int return5() {
			return(MaxAge5);
		}
		public double return6() {				//ChancetoX6 is returned as a double since it 
			double a;							//is easier to work with a fraction for its intended
			a=ChancetoX6/100;					//purposes
			return(a);
		}
	}
}
