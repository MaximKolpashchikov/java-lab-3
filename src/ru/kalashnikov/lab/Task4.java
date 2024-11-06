package ru.kalashnikov.lab;

import ru.kalashnikov.common.UI;
import ru.kalashnikov.weapons.AssaultRifle;

public class Task4
{
    public static void run()
    {
        UI.putQuestion("Задание 3.4 Автомат");

        UI.putSuccess("Создаю автомат A по умолчанию");
        AssaultRifle A = new AssaultRifle();

        UI.putSuccess("Создаю автомат B по максимальному числу патронов");
        int maxAmmo = UI.getInt("максимальное число патронов", x -> x > 0);
        AssaultRifle B = new AssaultRifle(maxAmmo);

        UI.putSuccess("Создаю автомат C по максимальному числу патронов и скорострельности");
        int rate = UI.getInt("скорострельность", x -> x > 0 && x <= maxAmmo);
        AssaultRifle C = new AssaultRifle(maxAmmo, rate);

        UI.putMessage("Автомат B стреляет");
        B.fire();

        UI.putMessage("Автомат C стреляет");
        C.fire();

        int secs = UI.getInt("сколько секунд стрелять", x -> x > 0);

        UI.putMessage(String.format("Автомат B стреляет %d секунд", secs));
        B.fire(secs);

        UI.putMessage(String.format("Автомат C стреляет %d секунд", secs));
        C.fire(secs);
    }
}
