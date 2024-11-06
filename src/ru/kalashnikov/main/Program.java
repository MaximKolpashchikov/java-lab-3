package ru.kalashnikov.main;

import ru.kalashnikov.common.UI;
import ru.kalashnikov.lab.*;

public class Program
{
    public static void main(String[] args)
    {
        String[] menu = {
            "Дом над землей",
            "Перезарядка Пистолета",
            "Неизменяемый массив",
            "Автомат",
            "Оружие",
            "Лучший стрелок",
            "Сравнение точек",
            "Возведение в степень",
            "Патроны наследникам"
        };

        int sel;

        do
        {
            sel = UI.getChoice("Выберите задание", menu);

            switch (sel)
            {
                case 0: Task1.run(); break;
                case 1: Task2.run(); break;
                case 2: Task3.run(); break;
                case 3: Task4.run(); break;
                case 4: Task5.run(); break;
                case 5: Task6.run(); break;
                case 6: Task7.run(); break;
                case 7: Task8.run(args); break;
                case 8: Task9.run(); break;
            }

            UI.pause();
        }
        while (sel < menu.length);

        UI.close();
    }
}