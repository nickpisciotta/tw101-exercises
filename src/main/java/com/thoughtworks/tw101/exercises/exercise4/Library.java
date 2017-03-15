package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public void printBooksContaining(String partialBookTitle) {
        for(String bookTitle : books) {
            if(partialTitleMatch(bookTitle, partialBookTitle)) {
                printStream.println(bookTitle);
            }
        }
    }

    private boolean partialTitleMatch(String fullTitle, String partialTitle) {
        if (fullTitle.toLowerCase().contains(partialTitle.toLowerCase())) {
            return true;
        }
        return false;
    }

}


