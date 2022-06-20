package com.example.designmode.abstract_factory.app;

import com.example.designmode.abstract_factory.buttons.Button;
import com.example.designmode.abstract_factory.checkboxes.Checkbox;
import com.example.designmode.abstract_factory.factory.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {

    private final Button button;

    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
