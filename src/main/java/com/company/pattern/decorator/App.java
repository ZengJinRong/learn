package com.company.pattern.decorator;

public final class App {
    private App(){
    }

    public static void main(String[] args){
        MagicalGirl magicalGirl = new MagicalGirl(new Girl());
        magicalGirl.say();
    }
}
