package org.yan.practice.patterns.behavioral.command;

/**
 * @author pangyan
 * @date 2020/6/8 16:00
 * @description 从剪贴板粘贴文字
 */
public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
