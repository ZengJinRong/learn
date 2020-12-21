package com.company.pattern.proxy;

public class Website {
    private String name;
    private boolean ban;

    public Website(String name, boolean ban) {
        this.name = name;
        this.ban = ban;
    }

    public String getName() {
        return name;
    }

    public boolean isBan() {
        return ban;
    }
}
