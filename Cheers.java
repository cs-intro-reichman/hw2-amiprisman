// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	  // first chunk of code that prints letter individualy 
          // as well as deciding whether to make it an "a" or "an"
            String word = (args[0]);
            int times = Integer.parseInt(args[1]);
            String UpWord = word.toUpperCase();
            int length = UpWord.length();
            for (int i = 0; i < length; i++) {
                char letter = UpWord.charAt(i);
                String check = "AEFHILMNORSX";
                String article = "j";
                if (check.indexOf(letter) != -1) {
                article = "an";
                System.out.println("Give me " + article + " " + letter + ":" + " " + letter + "!" );
                 } else {
                article = "a";
                System.out.println("Give me " + article + "  " + letter + ":" + " " + letter + "!" );
                 }
                
            }
            System.out.println("What does that spell?");
            // second part that prints out the cheered word "times" number of times
             for (int x = 0; x < times; x++){
                System.out.println(UpWord+ "!!!");
             }
            
            
          
           
        }
}
