// Write a Java method to compute the average of three numbers.

public class AverageCalculator {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int average = averageOfNums(num1, num2, num3);
            System.out.println(average);
    }

    public static int averageOfNums(int a, int b, int c) {
        return (a + b + c) / 3;
    }

}
