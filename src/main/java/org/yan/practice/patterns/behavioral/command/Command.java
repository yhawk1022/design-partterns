package org.yan.practice.patterns.behavioral.command;

/**
 * @author pangyan
 * @date 2020/6/5 10:51
 * @description 抽象基础命令
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
