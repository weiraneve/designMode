package com.example.designmode.abstract_factory.factory;

import com.example.designmode.abstract_factory.buttons.Button;
import com.example.designmode.abstract_factory.buttons.MacOSButton;
import com.example.designmode.abstract_factory.checkboxes.Checkbox;
import com.example.designmode.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
