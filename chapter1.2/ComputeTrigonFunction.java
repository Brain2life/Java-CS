// Exercise 1.2.21
// javac ComputeTrigonFunction.java
// java ComputeTrigonFunction [t]

public class ComputeTrigonFunction {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double radians = Math.toRadians(t);
        double output = Math.sin(2*radians) + Math.sin(3*radians);
        System.out.println(output);
    }
}