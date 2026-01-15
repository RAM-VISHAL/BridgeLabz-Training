package com.BrowserBuddy;

import java.util.Stack;

public class BrowserTab {

    private HistoryNode current;
    private Stack<HistoryNode> forwardStack = new Stack<>();

    // Open new website
    public void visit(String url) {
        HistoryNode newNode = new HistoryNode(url);

        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }

        current = newNode;
        forwardStack.clear(); // clear forward history
        System.out.println("Visited: " + url);
    }

    // Go Back
    public void back() {
        if (current == null || current.prev == null) {
            System.out.println("No page to go back");
            return;
        }

        forwardStack.push(current);
        current = current.prev;
        System.out.println("Back to: " + current.url);
    }

    // Go Forward
    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("No page to go forward");
            return;
        }

        HistoryNode node = forwardStack.pop();
        current = node;
        System.out.println("Forward to: " + current.url);
    }

    public String getCurrentPage() {
        return current != null ? current.url : "No page opened";
    }
}
