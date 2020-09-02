// Exercise 1.2.27
// javac RandomGaussian.java
// java RandomGaussian

public class RandomGaussian {
    public static void main(String[] args) {
        double u = Math.random();
        double v = Math.random();

        double output = Math.sqrt(Math.sin((2 * Math.PI * v)) * (-2 * Math.log(u)));
        System.out.println("Random Gaussian number: " + output);
    }
}