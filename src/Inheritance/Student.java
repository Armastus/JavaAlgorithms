package Inheritance;

class Student extends Person{
    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    private int[] testScores;
    Student(String firstName, String lastName, int idNumber, int[] scores) {
        super(firstName, lastName, idNumber);
        this.testScores = scores;
    }
    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Write your method here
    char calculate() {
        char grade = 'a';
        int sum = 0;
        int average;

        for(int ii : testScores) {
            sum = sum + testScores[ii];
        }

        average = sum / testScores.length;

        if(average >= 90 && average <= 100) {
            grade = 'O';
        } else if (average >= 80 && average <= 90) {
            grade = 'E';
        }else if (average >= 70 && average <= 80) {
            grade = 'A';
        }else if (average >= 55 && average <= 70) {
            grade = 'P';
        }else if (average >= 40 && average <= 55) {
            grade = 'D';
        }else if (average <= 40) {
            grade = 'T';
        }
        return grade;
    }
}
