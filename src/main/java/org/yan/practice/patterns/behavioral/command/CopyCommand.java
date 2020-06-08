package org.yan.practice.patterns.behavioral.command;

/**
 * @author pangyan
 * @date 2020/6/8 16:03
 * @description 将所选文字复制到剪切板
 */
public class CopyCommand extends Command {

    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}