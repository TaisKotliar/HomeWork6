package ua.org.oa.TaisKotliar;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {

        testArrayIndexOutOfBoundsException();
        testIllegalArgumentException();
        testClassCastException();
        testStringIndexOutOfBoundsException();
        testNullPointerException();
        testStackOverflowError();
        testNumberFormatException();
        testOutOfMemoryError();
    }

    public static void testArrayIndexOutOfBoundsException() {
        int[] array = new int[10];
        try {
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Задание 1. Обращение к несуществующему элементу массива");
        }
    }

    public static void testIllegalArgumentException() {
        double[] array = new double[10];
        try {
            Array.getInt(array, 1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Задание 2. Недопустимый аргумент");
        }
    }

    public static void testClassCastException() {
        Object test1 = "10.5";
        try {
            System.out.println((int) test1);
        } catch (ClassCastException ex) {
            System.out.println("Задание 3. Недопустимое обращение к классу");
        }
    }

    public static void testStringIndexOutOfBoundsException() {
        String test2 = "Exception";
        try {
            System.out.println(test2.charAt(20));
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Задание 4. Обращение к несуществующему элементу строки");
        }
    }

    public static void testNullPointerException() {
        Object myObj = null;
        try {
            System.out.println(myObj.toString());
        } catch (NullPointerException ex) {
            System.out.println("Задание 5.1. Обращение к несуществующему объекту");
        }
        int[] ar = null;
        try {
            System.out.println(ar.length);
        } catch (NullPointerException ex) {
            System.out.println("Задание 5.2. Обращение к несуществующему массиву");
        }
        try {
            System.out.println(ar[3]);
        } catch (NullPointerException ex) {
            System.out.println("Задание 5.3. Обращение к несуществующему элементу массивa");
        }
    }

    public static void testStackOverflowError() {
        try {
            testStackOverflowError();
        } catch (StackOverflowError ex) {
            System.out.println("Задание 6. Рекурсия");
            return;
        }
    }

    public static void testNumberFormatException() {
        try {
            Integer.parseInt("1y");
        } catch (NumberFormatException ex) {
            System.out.println("Задание 7. Ошибка приведения формата");
            return;
        }
    }

    public static void testOutOfMemoryError() {
        try {
            int[] bigAr = new int[1000000000];
        } catch (OutOfMemoryError ex) {
            System.out.println("Задание 8. Переполнение памяти");
        }
    }
}