package org.QuizApp;

public class QuizManager {
    Questions qs;
    public QuizManager(int noOfQuestions)
    {
        qs = new Questions(noOfQuestions);
    }


    public int userResult() {
        qs.getQuestionFromUser();
        int res = 0;
        String[] Useranswers = qs.displayQuestions();
        for (int i = 0; i < qs.ans.length; i++) {
            res = (Useranswers[i].equalsIgnoreCase(qs.ans[i]) ? (res += 2) : (res -= 1));

        }
        return res;
    }
}
