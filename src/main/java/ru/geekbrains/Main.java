package ru.geekbrains;

import ru.geekbrains.arrays.CustomArrays;
import ru.geekbrains.exceptions.MyArrayDataException;
import ru.geekbrains.exceptions.MyArraySizeException;
import ru.geekbrains.exceptions.MyArrayEmptyException;
import ru.geekbrains.exceptions.MyArrayNullException;

public class Main {

    static CustomArrays ca = new CustomArrays();

    public static void RunHomeworkGood() {
        int sumOfArrayElements = 0;
        try {
            String[][] newArray = ca.createStringArray(4);
            newArray = ca.fillCharArray(newArray, 23);
            sumOfArrayElements = ca.sumArrayElements(newArray);
            System.out.println("Сумма всех позиций в массиве = " + sumOfArrayElements);
        } catch (MyArrayDataException | MyArraySizeException | MyArrayEmptyException | MyArrayNullException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void RunHomeworkBad1() {
        int sumOfArrayElements = 0;
        try {
            String[][] newArray = ca.createStringArray(3);
            newArray = ca.fillCharArray(newArray, 23);
            sumOfArrayElements = ca.sumArrayElements(newArray);
            System.out.println("Сумма всех позиций в массиве = " + sumOfArrayElements);
        } catch (MyArrayDataException | MyArraySizeException | MyArrayEmptyException | MyArrayNullException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void RunHomeworkBad2() {
        int sumOfArrayElements = 0;
        try {
            String[][] newArray = null;
            newArray = ca.fillCharArray(newArray, 23);
            sumOfArrayElements = ca.sumArrayElements(newArray);
            System.out.println("Сумма всех позиций в массиве = " + sumOfArrayElements);
        } catch (MyArrayDataException | MyArraySizeException | MyArrayEmptyException | MyArrayNullException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void RunHomeworkBad3() {
        int sumOfArrayElements = 0;
        try {
            String[][] newArray = new String[0][0];
            newArray = ca.fillCharArray(newArray, 23);
            sumOfArrayElements = ca.sumArrayElements(newArray);
            System.out.println("Сумма всех позиций в массиве = " + sumOfArrayElements);
        } catch (MyArrayDataException | MyArraySizeException | MyArrayEmptyException | MyArrayNullException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void RunHomeworkBad4() {
        int sumOfArrayElements = 0;
        try {
            String[][] newArray = ca.createStringArray(4);
            sumOfArrayElements = ca.sumArrayElements(newArray);
            System.out.println("Сумма всех позиций в массиве = " + sumOfArrayElements);
        } catch (MyArrayDataException | MyArraySizeException | MyArrayEmptyException | MyArrayNullException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        RunHomeworkGood();
        RunHomeworkBad1(); // Неправильный размер массива
        RunHomeworkBad2(); // Массив не существует
        RunHomeworkBad3(); // Массив нулевого размера
        RunHomeworkBad4(); // Не удалось конвертировать null
    }

}
