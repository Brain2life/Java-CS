// Exercise 1.2.25
// javac ComputeTemperature.java
// java ComputeTemperature [temperature] [velocity]

public class ComputeTemperature {
    public static void main(String[] args) {
        double temperature = Double.parseDouble(args[0]);
        double velocity = Double.parseDouble(args[1]);

        double w = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(velocity, 0.16);
        System.out.println("Output wind chill is: " + w);
    }
}