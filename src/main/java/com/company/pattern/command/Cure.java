package com.company.pattern.command;

public class Cure implements Command {
    private Entity target;

    @Override
    public void execute(Entity target) {
        int hp = target.getHp();
        target.setHp(hp + 5);
        this.target = target;
    }

    @Override
    public void undo() {
        int hp = target.getHp();
        target.setHp(hp - 5);
    }

    @Override
    public void redo() {
        int hp = target.getHp();
        target.setHp(hp + 5);
    }
}
