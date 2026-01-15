package com.BrowserBuddy;

public class Main {
    public static void main(String[] args) {

        TabManager manager = new TabManager();
        BrowserTab tab = manager.getCurrentTab();

        tab.visit("google.com");
        tab.visit("openai.com");
        tab.visit("github.com");

        tab.back();
        tab.back();
        tab.forward();

        manager.closeTab();

        manager.reopenTab();
        tab = manager.getCurrentTab();

        System.out.println("Current Page: " + tab.getCurrentPage());
    }
}
