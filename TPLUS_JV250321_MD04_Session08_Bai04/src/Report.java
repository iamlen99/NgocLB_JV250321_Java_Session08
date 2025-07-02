public class Report {
    public static void main(String[] args) {
        double [] studentScores = {6.5, 9, 4};
        double avgScore = calculateAverage(studentScores);
        displayStudentInfo("Ngoc", 26, avgScore);
        generateScores(avgScore);
    }

    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public static void displayStudentInfo (String name, int age, double avgScore){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Avg Score: " + avgScore);
    }

    public static void generateScores (double score){
        if (score >= 8){
            System.out.println("Grade: Excellent");
        } else if (score >= 5){
            System.out.println("Grade: Good");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
