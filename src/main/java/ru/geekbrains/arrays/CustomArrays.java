package ru.geekbrains.arrays;

import ru.geekbrains.exceptions.MyArrayDataException;
import ru.geekbrains.exceptions.MyArraySizeException;
import ru.geekbrains.exceptions.MyArrayEmptyException;
import ru.geekbrains.exceptions.MyArrayNullException;
import ru.geekbrains.parses.CustomInteger;

import java.util.Random;

public class CustomArrays {

    static CustomInteger customInteger = new CustomInteger();

    public String[][] createStringArray(int size) {
        if (size !=4) {
            throw new MyArraySizeException("Массив строк может быть только 4х4");
        }
        return new String[size][size];
    }

    public String[][] fillCharArray(String[][] stringArray, int maxBoundary) {

        if (stringArray == null) {
            throw new MyArrayNullException("Массив не существует");
        }

        if (stringArray.length == 0) {
            throw new MyArrayEmptyException("Массив нулевого размера");
        }

        Random random = new Random();

        for (int arrayX = 0; arrayX<stringArray.length; arrayX++) {
            for (int arrayY = 0; arrayY < stringArray[arrayX].length; arrayY++) {
                stringArray[arrayX][arrayY] = String.valueOf(random.nextInt(maxBoundary));
            }
        }
        return stringArray;
    }

    public int sumArrayElements(String[][] stringArray) {

        if (stringArray == null) {
            throw new MyArrayNullException("Массив не существует");
        }

        if (stringArray.length == 0) {
            throw new MyArrayEmptyException("Массив нулевого размера");
        }

        int sumArrayElements = 0;
        int parsedInt = 0;

        for (int arrayX = 0; arrayX<stringArray.length; arrayX++) {
            for (int arrayY = 0; arrayY<stringArray[arrayX].length; arrayY++) {
                try {
                    parsedInt = CustomInteger.parseInt(stringArray[arrayX][arrayY]);
                } catch (MyArrayDataException e) {
                    String sb = "Ошибка преобразования " + stringArray[arrayX][arrayY] + " в число " +
                            "на позиции [" + arrayX + "][" + arrayY + "]\n";
                    throw new MyArrayDataException(sb);
                }
                if (parsedInt>0) {
                    sumArrayElements = sumArrayElements + parsedInt;
                }
            }
        }
        return sumArrayElements;
    }

}
