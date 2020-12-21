package com.company.pattern.state;

public class AwakeState implements State {

    private Human human;

    public AwakeState(Human human) {
        this.human = human;
    }

    @Override
    public void say() {
        System.out.println(human.getName() + ": ......");
    }
}
