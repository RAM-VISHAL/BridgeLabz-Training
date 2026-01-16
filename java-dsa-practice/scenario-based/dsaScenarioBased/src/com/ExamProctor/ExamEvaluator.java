package com.ExamProctor;

import java.util.HashMap;
import java.util.List;

public class ExamEvaluator {

    // Function to calculate score
    public static int calculateScore(
            HashMap<Integer, String> studentAnswers,
            List<Question> questions) {

        int score = 0;

        for (Question q : questions) {
            String studentAnswer = studentAnswers.get(q.getId());

            if (studentAnswer != null &&
                studentAnswer.equalsIgnoreCase(q.getCorrectAnswer())) {
                score++;
            }
        }
        return score;
    }
}
