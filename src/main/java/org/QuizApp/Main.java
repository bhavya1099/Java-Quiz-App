package org.QuizApp;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int noOfQuestions=5;
        QuizManager qm = new QuizManager(noOfQuestions);
        int result =qm.userResult();
        System.out.println("----------------------------------");
        System.out.println("Result = "+result);
    }
}
