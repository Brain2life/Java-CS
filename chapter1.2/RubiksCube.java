// Exercise 1.2.20
// javac RubiksCube.java
// java RubiksCube

public class RubiksCube {
    public static void main(String[] args) {
        int a = 6;
        int b = 1;
        double r = Math.random();

        // double type [0,1)
        int firstToss = (int)((r + 0.1) * (a - b) + b);
        int secondToss = (int)((r + 0.1) * (a - b) + b);
        
        System.out.println(firstToss + secondToss);
    }
}