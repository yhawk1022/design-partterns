package org.yan.practice.patterns.creational.factorymethod;

/**
 * @author pangyan
 * @date 2020/6/23 0:40
 * @description
 */
public class HtmlDialog extends Dialog{
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
