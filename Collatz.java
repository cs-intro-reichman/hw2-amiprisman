public class Collatz {
    public static void main(String args[]) {
        // Parse the command-line arguments
        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int spot = 1; spot <= N; spot++) {
            int current = spot;
            int steps = 0;
            String sequence = "";

            // print 1st sequence right away
            if (current == 1) {
                sequence = "1 4 2 1"; 
                steps = 4; 
            } else {
                // continue on
                while (current != 1) {
                    sequence = sequence + current + " ";
                    steps = steps + 1;
                    if (current % 2 == 0) {
                        current = current / 2;
                    } else {
                        current = (current * 3) + 1;
                    }
                }
                sequence = sequence + "1"; // add the last 1 after the loop
                steps = steps +1; // count that as a step
            }

            // Print the sequence 
            if (mode.equals("v")) {
                System.out.println(sequence + " (" + (steps) + ")");
            }
        }

        // Print the summary in concise mode
        if (mode.equals("c")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }
}