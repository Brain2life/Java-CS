// Exercise 1.2.28
// javac IsSorted.java
// java IsSorted [x] [y] [z]

public class IsSorted {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean output = ((x < y) && (y < z) && (x < z)) || ((x > y) && (y > z) && (x > z));
        System.out.println(output);
    }
}
