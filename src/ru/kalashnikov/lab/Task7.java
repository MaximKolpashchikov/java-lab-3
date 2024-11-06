package ru.kalashnikov.lab;

import ru.kalashnikov.common.UI;
import ru.kalashnikov.geometry.Point;

import java.util.Random;

public class Task7
{
    public static void run()
    {
        UI.putQuestion("Задача 6.2 Сравнение точек");

        Random rng = new Random();

        UI.putSuccess("Создаю 3 точки");

        Point A = new Point(
            rng.nextInt(0, 100),
            rng.nextInt(0, 100)
        );
        Point B = new Point(
            rng.nextInt(0, 100),
            rng.nextInt(0, 100)
        );
        Point C = new Point(
            A.getX(),
            A.getY()
        );

        UI.putSuccess(A.toString());
        UI.putSuccess(B.toString());
        UI.putSuccess(C.toString());

        UI.putSuccess(String.format("A = B? %b", A.equals(B)));
        UI.putSuccess(String.format("A = C? %b", A.equals(C)));
        UI.putSuccess(String.format("B = A? %b", B.equals(A)));
        UI.putSuccess(String.format("C = A? %b", C.equals(A)));
    }
}
