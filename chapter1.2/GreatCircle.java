// Exercise 1.2.33
// javac GreatCircle.java
// java GreatCircle [x1] [y1] [x2] [y2]

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        // 1 degree = 111.13486 km
        final double L = 111.13486;

        double d = 60 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        double distance = L * d;
        System.out.println("Distance is: " + distance);
    }
}
