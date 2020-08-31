// Exercise 1.2.24
// javac PercentCount.java
// java PercentCount [t] [p] [r]

public class PercentCount {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double p = Double.parseDouble(args[1]);
        double r = Double.parseDouble(args[2]);

        double sum = p * Math.exp(r * t);
        System.out.println(sum);
    }
}