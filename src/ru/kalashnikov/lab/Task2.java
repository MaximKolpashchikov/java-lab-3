package ru.kalashnikov.lab;

import ru.kalashnikov.weapons.Pistol;
import ru.kalashnikov.common.UI;

public class Task2
{
    public static void run()
    {
        UI.putQuestion("Задание 1.5 Перезарядка Пистолета");

        UI.putSuccess("Создаю пистолет вместимостью 7");
        Pistol p = new Pistol(7);

        UI.putSuccess("Заряжаю 3 патрона");
        int r = p.reload(3);
        if (r > 0) UI.putWarning(String.format("Возвращены %d патронов", r));

        UI.putSuccess("Стреляю 5 раз");
        for (int i = 0; i < 5; ++i) p.fire();

        UI.putSuccess("Заряжаю 8 патронов");
        r = p.reload(8);
        if (r > 0) UI.putWarning(String.format("Возвращены %d патронов", r));

        UI.putSuccess("Стреляю 2 раза");
        for (int i = 0; i < 2; ++i) p.fire();

        UI.putSuccess("Разряжаю и делаю контрольный");
        p.unload();
        p.fire();
    }
}
