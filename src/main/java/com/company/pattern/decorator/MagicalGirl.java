package com.company.pattern.decorator;

public class MagicalGirl implements Human {
    Human human;

    public MagicalGirl(Human human) {
        this.human = human;
    }

    @Override
    public void say() {
        System.out.println("Transform");
        human.say();
    }
}
