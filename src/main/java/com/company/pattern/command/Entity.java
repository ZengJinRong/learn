package com.company.pattern.command;

import java.util.Deque;
import java.util.LinkedList;

public abstract class Entity {
    private Deque<Command> undoStack = new LinkedList<>();
    private Deque<Command> redoStack = new LinkedList<>();

    private String name;
    private int hp;

    public Entity(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void beAttacked(int hurt) {
        this.hp -= hurt;
    }

    public void printStatus() {
        System.out.println(name + "[hp=" + hp + "]");
    }

    public void doCommand(Command command, Entity target) {
        command.execute(target);
        undoStack.offerLast(command);
    }

    public void undoLastCommand() {
        if (!undoStack.isEmpty()) {
             Command command = undoStack.pollLast();
            redoStack.offerLast(command);
            command.undo();
        }
    }

    public void redoLastCommand() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pollLast();
            undoStack.offerLast(command);
            command.redo();
        }
    }
}
