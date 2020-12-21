package com.company.pattern.state;

public class Human {

    private String name;

    private State state;

    public Human(String name) {
        this.name = name;
        this.state = new AwakeState(this);
    }

    public void changeState() {
        if (state.getClass().equals(SleepState.class)) {
            changeStateTo(new AwakeState(this));
        } else {
            changeStateTo(new SleepState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
    }

    public void say() {
        this.state.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
