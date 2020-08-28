// Exercise 1.2.15
// javac CheckTriangleSides.java
// java CheckTriangleSides [a] [b] [c]

public class CheckTriangleSides {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        boolean output = (a >= b + c);

        System.out.println(output);

    }
}