// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int times = Integer.parseInt(args[0]);
		double step = 0.0;
		for (int i = 0; i < times; i++) {
			double operation = 1.0/((2*i) + 1);
			if (i%2==0){
				step = step + operation;
			}
			else {
				step = step - operation;
			}
		}
		double sum = step * 4;


		System.out.println("pi according to Java: " + Math.PI);
	    System.out.println("pi, approximated:     " + sum);
	}
}
