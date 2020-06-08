package org.yan.practice.patterns.behavioral.command;

import org.yan.practice.patterns.behavioral.command.Command;

import java.util.Stack;

/**
 * @author pangyan
 * @date 2020/6/8 15:52
 * @description
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() { return history.isEmpty(); }
}
