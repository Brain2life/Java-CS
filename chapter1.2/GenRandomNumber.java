// Exercise 1.2.19
// javac GenRandomNumber.java
// java GenRandomNumber [a] [b]
// https://www.baeldung.com/java-generating-random-numbers-in-range

public class GenRandomNumber {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double r = Math.random();
        int value = (int)(r * (a - b) + b);
        
        System.out.println(value);
    }
}