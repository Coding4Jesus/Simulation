package sim;
public class Simulation {
/* 
 * Jesus on wolves
 * Jack on rabbits
 * devin on the environment
 */
	public static void main(String[] args) {
		Wolves wolves = new Wolves();
		Wolves wolves2 = new Wolves();
		System.out.print(wolves.NumberW1);
		

	}
	
	public static class Wolves {
		private static int NumberW1, Metabol2, StartF3, MaxF4, MaxAge5, ChancetoX6;
		public Wolves() {
			NumberW1 = 10;
			Metabol2 = 10;
			StartF3 = 50;
			MaxF4 = 150;
			MaxAge5 = 50;
			ChancetoX6 = 75;
		}
		public void Change1(int placehold) {
			NumberW1 = placehold;
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
		public int return1() {
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
		public double return6() {
			double a;
			a=ChancetoX6/100;
			return(a);
		}
	}
}
