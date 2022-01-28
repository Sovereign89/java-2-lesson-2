package ru.geekbrains.exceptions;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(String errorMessage) {
        super(errorMessage);
    }

}
