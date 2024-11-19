// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    int times = Integer.parseInt(args[0]);
		int over = 0;
		int under = 0;
		for (int i = 0; i < times; i++) {
			double random = Math.random();
			if (random>0.5){
				over++;
				}
			else {
				under++;
			}
		}
		
		System.out.println("> 0.5: " + over + " times");
		System.out.println("<= 0.5: " + under + " times");
		
		

		
		if (under!=0){
			double ratio = (double) over / under;
			System.out.println("ratio: " + ratio); 
		}


	}
}
