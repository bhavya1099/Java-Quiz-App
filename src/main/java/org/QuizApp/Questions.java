package org.QuizApp;

import java.util.Scanner;

public class Questions
{
   Scanner sc = new Scanner(System.in);
   private int noOfQuestions;
   private String[] questions;
   private String[][] options;
   public String[] ans;
   public String[] UserAns;

   public Questions(int noOfQuestions){
      this.noOfQuestions=noOfQuestions;
      questions = new String[noOfQuestions];
      options  = new String[noOfQuestions][4];
      ans  = new String[noOfQuestions];
      UserAns  = new String[noOfQuestions];

   }

   public void getQuestionFromUser()
   {

      for (int i = 0; i < questions.length; i++) {
         System.out.println("Please enter question " + (i + 1) + ": ");
         questions[i] = sc.nextLine();

         for (int j = 0; j < options[i].length; j++) {
            System.out.println("Enter the option:"+(j+1)+" for the question: "+(i+1));
            options[i][j] = sc.nextLine();
         }
         System.out.println("Please enter Ans for question: "+(i+1));
         ans[i] = sc.nextLine();
      }
   }
   public  String[] displayQuestions()
   {
      System.out.println("Starting with the Quiz, Questions are:  ");
      for (int i=0; i<questions.length; i++)
      {
         System.out.println(questions[i]);
         for (int j=0; j<options[i].length; j++)
         {
            System.out.println(options[i][j]);
         }
         System.out.println("Please enter your Answer: ");
         UserAns[i]= sc.nextLine();

      }
      return UserAns;
   }




}
