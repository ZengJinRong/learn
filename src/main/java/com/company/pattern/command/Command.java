package com.company.pattern.command;

public interface Command {

    void execute(Entity target);

    void undo();

    void redo();
}
