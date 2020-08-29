// Exercise 1.2.22
// javac ComputeDistance.java
// java ComputeDistance [x0] [v0] [t]

public class ComputeDistance {
    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        final double g = 9.80665;

        double distance = x0 + v0*t - g * (Math.pow(t, 2)/2);
        System.out.println(distance);
    }
}