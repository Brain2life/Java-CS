// Exercise 1.2.30
// javac GenUniformRandomNumbers.java
// java GenUniformRandomNumbers

public class GenUniformRandomNumbers {
    public static void main(String[] args) {
        double firstNum = Math.random();
        double secondNum = Math.random();
        double thirdNum = Math.random();
        double fourthNum = Math.random();
        double fifthNum = Math.random();

        double average = (firstNum + secondNum + thirdNum + fourthNum + fifthNum) / 5;
        double minimalNum = Math.min(Math.min(Math.min(Math.min(firstNum, secondNum), thirdNum), fourthNum), fifthNum);
        double maximalNum = Math.max(Math.max(Math.max(Math.max(firstNum, secondNum), thirdNum), fourthNum), fifthNum);
        
        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);
        System.out.println(fourthNum);
        System.out.println(fifthNum);

        System.out.println("Average is " + average);
        System.out.println("Minimal number is " + minimalNum);
        System.out.println("Maximal number is " + maximalNum);
    }
}
