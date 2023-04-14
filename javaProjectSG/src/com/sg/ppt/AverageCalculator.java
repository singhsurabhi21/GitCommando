package com.sg.ppt;

public class AverageCalculator {
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        double[] numbers = { 1.2, 3.4, 5.6, 7.8, 9.0 };
        double average = calculateAverage(numbers);
        System.out.println("The average of the numbers is " + average);
    }
}

