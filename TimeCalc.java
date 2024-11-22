
public class TimeCalc {

    public static void main(String[] args) {
        // receive time and minutes to add in 24 hour time
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int add = Integer.parseInt(args[1]);
        int totalmin = (hours * 60) + minutes + add;
        int th = totalmin / 60;
        int fh = th % 24;
        int fm = totalmin - (th * 60);
        String hr = "";
        String min = "";

        if (fm < 10) {
            min = "0" + fm;
        } else {
            min = "" + fm;
        }
        if (fh < 10) {
            hr = "0" + fh;
        } else {
            hr = "" + fh;
        }

        System.out.print(hr + ":" + min);
    }
}
