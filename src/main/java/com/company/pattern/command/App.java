package com.company.pattern.command;

public final class App {
    public static void main(String[] args) {
        Hero rabbit = new Hero("Rabbit", 500);
        Hero alice = new Hero("Alice", 1000);
        rabbit.printStatus();
        alice.doCommand(new Attack(), rabbit);
        rabbit.printStatus();
        alice.doCommand(new Attack(), rabbit);
        rabbit.printStatus();

        alice.undoLastCommand();
        rabbit.printStatus();

        alice.redoLastCommand();
        rabbit.printStatus();

        alice.undoLastCommand();
        rabbit.printStatus();
        alice.undoLastCommand();
        rabbit.printStatus();

        alice.doCommand(new Cure(),rabbit);
        rabbit.printStatus();
    }
}
