package ru.kalashnikov.lab;

import ru.kalashnikov.common.UI;
import ru.kalashnikov.buildings.House;

public class Task1
{
    public static void run()
    {
        UI.putQuestion("Задание 1.1 Дом над землей");

        int floors = UI.getInt("Введите количество этажей");

        try
        {
            House h = new House(floors);
            UI.putSuccess(h.toString());
        }
        catch (Exception e)
        {
            UI.putError("Не удалось создать дом: " + e.getMessage());
        }
    }
}
