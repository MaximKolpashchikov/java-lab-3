package ru.kalashnikov.lab;

import ru.kalashnikov.common.UI;
import ru.kalashnikov.weapons.ModifiedPistol2;

public class Task9
{
    public static void run()
    {
        UI.putQuestion("Задание 8.2 Патроны наследникам");

        UI.putSuccess("Создаю новый-преновый пистолет вместимостью 7");
        ModifiedPistol2 p = new ModifiedPistol2(7);

        UI.putSuccess("Заряжаю 3 патрона");
        int r = p.reload(3);
        if (r > 0) UI.putWarning(String.format("Возвращены %d патронов", r));

        UI.putSuccess("Стреляю 5 раз");
        for (int i = 0; i < 5; ++i) p.shoot();

        UI.putSuccess("Заряжаю 8 патронов");
        r = p.reload(8);
        if (r > 0) UI.putWarning(String.format("Возвращены %d патронов", r));

        UI.putSuccess("Стреляю 2 раза");
        for (int i = 0; i < 2; ++i) p.shoot();

        UI.putSuccess("Разряжаю и делаю контрольный");
        p.unload();
        p.shoot();
    }
}
