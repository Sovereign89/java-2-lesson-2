package ru.geekbrains.exceptions;

public class MyArrayEmptyException extends RuntimeException {

    public MyArrayEmptyException(String errorMessage) {
        super(errorMessage);
    }

}
