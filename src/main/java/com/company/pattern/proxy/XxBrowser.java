package com.company.pattern.proxy;

public class XxBrowser implements Browser {

    @Override
    public void go(Website website) {
        System.out.println(website.getName());
    }
}
