package com.example.designmode.abstract_factory.factory;

import com.example.designmode.abstract_factory.buttons.Button;
import com.example.designmode.abstract_factory.buttons.WindowsButton;
import com.example.designmode.abstract_factory.checkboxes.Checkbox;
import com.example.designmode.abstract_factory.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
