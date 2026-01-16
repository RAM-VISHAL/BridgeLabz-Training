package com.ExamProctor;

import java.util.*;

public class ExamProctorApp {

    public static void main(String[] args) {

        // Create exam questions
        List<Question> questions = Arrays.asList(
                new Question(1, "A"),
                new Question(2, "B"),
                new Question(3, "C")
        );

        StudentSession session = new StudentSession();

        // Simulate navigation
        session.visitQuestion(1);
        session.visitQuestion(2);
        session.visitQuestion(3);

        // Submit answers
        session.submitAnswer(1, "A");
        session.submitAnswer(2, "C");
        session.submitAnswer(3, "C");

        // Evaluate exam
        int score = ExamEvaluator.calculateScore(
                session.getAnswers(), questions);

        System.out.println("\nFinal Score: " + score + "/" + questions.size());
    }
}
