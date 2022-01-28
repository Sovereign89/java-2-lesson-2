package ru.geekbrains.parses;

import ru.geekbrains.exceptions.MyArrayDataException;

public class CustomInteger {

    public static int parseInt(String strValue) {
        int n = 0;

        try {
            n = Integer.parseInt(strValue);
        } catch (NumberFormatException ex) {
            throw new MyArrayDataException("Не удалось конвертировать строку в число");
        }

        return n;
    }

}
