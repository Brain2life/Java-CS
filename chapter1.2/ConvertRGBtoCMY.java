// Exercise 1.2.32
// javac ConvertRGBtoCMY.java
// java ConvertRGBtoCMY [r] [g] [b]

public class ConvertRGBtoCMY {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int g = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double w = Math.max(Math.max(r/255, g/255), b/255);
        double c = (w - (r/255)) / w;
        double m = (w - (g/255)) / w;
        double y = (w - (b/255)) / w;
        double k = 1 - w;

        System.out.println("C value is: " + c);
        System.out.println("M value is: " + m);
        System.out.println("Y value is: " + y);
        System.out.println("K value is: " + k);
    }
}
