package com.company.pattern.proxy;

public class BrowserProxy implements Browser {

    private Browser browser;

    public BrowserProxy(Browser browser) {
        this.browser = browser;
    }

    @Override
    public void go(Website website) {
        if (website.isBan()) {
            System.out.println("[Intercept] " + website.getName());
        } else {
            browser.go(website);
        }
    }
}
