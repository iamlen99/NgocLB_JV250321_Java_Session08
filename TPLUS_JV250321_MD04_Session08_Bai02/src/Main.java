public class Main {
    public static void main(String[] args) {
        double[] marks = {7.5, 8.0, 6.5};
        double averageScore = calculateAverageScore(marks);
        if (averageScore >= 5) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static double calculateAverageScore (double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum / array.length;
    }
 }
