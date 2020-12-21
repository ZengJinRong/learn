package com.company.pattern.strategy;

public class Commuter {
    CommuteStrategy commuteStrategy;

    public Commuter(CommuteStrategy commuteStrategy) {
        this.commuteStrategy = commuteStrategy;
    }

    public void setCommuteStrategy(CommuteStrategy commuteStrategy) {
        this.commuteStrategy = commuteStrategy;
    }

    public void go(){
        commuteStrategy.execute();
    }
}
