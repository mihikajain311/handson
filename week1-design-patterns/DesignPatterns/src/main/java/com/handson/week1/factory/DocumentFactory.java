package com.handson.week1.factory;

public class DocumentFactory {

    public static Document createDocument(String type) {

        if (type.equalsIgnoreCase("word")) {
            return new WordDocument();
        }

        if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        }

        if (type.equalsIgnoreCase("excel")) {
            return new ExcelDocument();
        }

        throw new IllegalArgumentException("Invalid document type");
    }
}