// Exercise 1.2.31
// javac ComputeMercatorProjection.java
// java ComputeMercatorProjection [V0] [theta] [v]

public class ComputeMercatorProjection {
    public static void main(String[] args) {
        double v0 = Double.parseDouble(args[0]);
        double theta = Double.parseDouble(args[1]);
        double v = Double.parseDouble(args[2]);

        double x = v - v0;
        double y = 1/2 * Math.log((1 + Math.sin(theta))/(1 - Math.sin(theta)));
        System.out.println("X and Y coordinates are: " + x + " " + y);
    }
}
