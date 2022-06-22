package com.example.designmode.decorator;

import com.example.designmode.decorator.decorators.CompressionDecorator;
import com.example.designmode.decorator.decorators.DataSource;
import com.example.designmode.decorator.decorators.DataSourceDecorator;
import com.example.designmode.decorator.decorators.EncryptionDecorator;
import com.example.designmode.decorator.decorators.FileDataSource;

public class Demo {

    public static void main(String[] args) {
        String salaryRecords = """
                Name,Salary
                John Smith,100000
                Steven Jobs,912000
                """;
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
