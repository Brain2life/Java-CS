// Exercise 1.2.26
// javac ConvertDecartIntoPolar.java
// java ConvertDecartIntoPolar [x] [y]

public class ConvertDecartIntoPolar {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x*x + y*y);
        double feta = Math.atan2(y, x);

        System.out.println("r coordinate: " + r);
        System.out.println("feta coordinate: " + feta);
    }
}