package com.example.designmode.factory;

import com.example.designmode.factory.factory.Dialog;
import com.example.designmode.factory.factory.HtmlDialog;
import com.example.designmode.factory.factory.WindowsDialog;

/**
 * Demo class. Everything comes together here.
 */
public class Factory_Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
