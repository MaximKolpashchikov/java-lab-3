package ru.kalashnikov.lab;

import ru.kalashnikov.common.UI;
import ru.kalashnikov.structs.ImmutableList;

import java.util.Random;

public class Task3
{
    public static void run()
    {
        UI.putSuccess("Задание 2.1 Неизменяемый массив");

        Random rng = new Random();

        UI.putSuccess("Создаю массив А из списка 1, 2, 3, 4, 5");
        ImmutableList A = new ImmutableList(1, 2, 3, 4, 5);

        UI.putSuccess("Создаю массив B из стандартного массива");
        int size = UI.getInt("размер массива", x -> x > 0);
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) arr[i] = rng.nextInt(0, 100);
        ImmutableList B = new ImmutableList(arr);

        UI.putSuccess("Создаю массив C копированием B");
        ImmutableList C = new ImmutableList(B);

        UI.putMessage("Созданные массивы:");
        UI.putSuccess("A: " + A);
        UI.putSuccess("B: " + B);
        UI.putSuccess("C: " + C);

        int idx = UI.getInt("индекс в массиве B", x -> x >= 0 && x < size);
        UI.putSuccess(String.format("Значение в позиции %d: %d", idx, B.getAt(idx)));

        int val = UI.getInt("Введите новое значение");
        B.setAt(idx, val);

        UI.putSuccess(String.format("Массив B пустой? %b", B.isEmpty()));

        UI.putMessage("Измененные массивы:");
        UI.putSuccess("A: " + A);
        UI.putSuccess("B: " + B);
        UI.putSuccess("C: " + C);
    }
}
