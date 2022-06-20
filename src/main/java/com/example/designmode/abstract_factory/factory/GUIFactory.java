package com.example.designmode.abstract_factory.factory;

import com.example.designmode.abstract_factory.buttons.Button;
import com.example.designmode.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();

}
