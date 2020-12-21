package com.company.pattern.proxy;

public final class App {
    private App(){
    }

    public static void main(String[] args) {
        Browser browser = new BrowserProxy(new XxBrowser());
        browser.go(new Website("Youtube",true));
        browser.go(new Website("Github",false));
        browser.go(new Website("Stack Overflow",false));
        browser.go(new Website("Google",true));
    }
}
