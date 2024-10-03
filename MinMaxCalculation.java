public class MinMaxCalculation {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 6};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
