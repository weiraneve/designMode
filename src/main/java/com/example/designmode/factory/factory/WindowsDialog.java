package com.example.designmode.factory.factory;

import com.example.designmode.factory.buttons.Button;
import com.example.designmode.factory.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
