package ru.kalashnikov.lab;

import ru.kalashnikov.common.UI;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class Task8
{
    public static void run(String[] args)
    {
        UI.putQuestion("Задача 7.3 Возведение в степень");

        if (args.length < 2)
        {
            UI.putError("Недостаточно аргументов командной строки, ожидалось 2");
            return;
        }

        try
        {
            double result = power(args[0], args[1]);
            UI.putSuccess(String.format("%s ** %s = %f", args[0], args[1], result));
        }
        catch (Exception e)
        {
            UI.putError("Возникла ошибка: " + e);
        }
    }

    public static double power(String x, String y)
    {
        int a = parseInt(x);
        int b = parseInt(y);
        return pow(a, b);
    }
}
