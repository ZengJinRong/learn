package com.company.pattern.state;

public class SleepState implements State {

    private Human human;

    public SleepState(Human human) {
        this.human = human;
    }

    @Override
    public void say() {
        System.out.println(human.getName() + " :zzZ");
    }
}
