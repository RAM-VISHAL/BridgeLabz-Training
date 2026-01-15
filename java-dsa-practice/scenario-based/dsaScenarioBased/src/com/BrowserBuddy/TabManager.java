package com.BrowserBuddy;

import java.util.Stack;

public class TabManager {

    private Stack<BrowserTab> closedTabs = new Stack<>();
    private BrowserTab currentTab = new BrowserTab();

    // Close current tab
    public void closeTab() {
        closedTabs.push(currentTab);
        currentTab = new BrowserTab();
        System.out.println("Tab closed");
    }

    // Reopen last closed tab
    public void reopenTab() {
        if (closedTabs.isEmpty()) {
            System.out.println("No closed tabs to restore");
            return;
        }

        currentTab = closedTabs.pop();
        System.out.println("Tab restored");
    }

    public BrowserTab getCurrentTab() {
        return currentTab;
    }
}
