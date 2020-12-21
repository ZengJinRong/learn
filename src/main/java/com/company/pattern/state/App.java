package com.company.pattern.state;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        Human human = new Human("Tom");
        human.say();
        human.changeState();
        human.say();
        human.changeState();
        human.say();
    }
}
