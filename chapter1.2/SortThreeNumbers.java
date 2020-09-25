// Exercise 1.2.34
// javac SortThreeNumbers.java
// java SortThreeNumbers [a] [b] [c]

public class SortThreeNumbers {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        
        int maxNumber = Math.max(a, Math.max(b, c));
        int minNumber = Math.min(a, Math.min(b, c));
        int middleNumber = (a + b + c) - (maxNumber + minNumber);

        System.out.println("Sorted numbers are: " + minNumber + " " + middleNumber + " " + maxNumber);
    
    }
}
