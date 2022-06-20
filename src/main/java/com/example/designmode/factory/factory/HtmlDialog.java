package com.example.designmode.factory.factory;

import com.example.designmode.factory.buttons.Button;
import com.example.designmode.factory.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
