package com.ExamProctor;

import java.util.HashMap;
import java.util.Stack;

public class StudentSession {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> answers;

    public StudentSession() {
        navigationStack = new Stack<>();
        answers = new HashMap<>();
    }

    // Track question navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store answers
    public void submitAnswer(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    public Stack<Integer> getNavigationStack() {
        return navigationStack;
    }

    public HashMap<Integer, String> getAnswers() {
        return answers;
    }
}
