package ru.kalashnikov.lab;

import ru.kalashnikov.common.UI;
import ru.kalashnikov.weapons.Gunner;
import ru.kalashnikov.weapons.ModifiedAssaultRifle;
import ru.kalashnikov.weapons.ModifiedPistol;

public class Task6
{
    public static void run()
    {
        UI.putQuestion("Задача 5.8 Лучший стрелок");

        UI.putSuccess("Создаю стрелка без оружия");
        Gunner A = new Gunner("Петя");

        UI.putSuccess("Создаю стрелка с пистолетом");
        Gunner B = new Gunner("Витя");
        ModifiedPistol p = new ModifiedPistol(5);
        p.reload(5);
        B.setWeapon(p);

        UI.putSuccess("Создаю стрелка с автоматом");
        Gunner C = new Gunner("Митя");
        ModifiedAssaultRifle r = new ModifiedAssaultRifle(10);
        r.reload(10);
        C.setWeapon(r);

        UI.putMessage("Собрали бригаду:");
        UI.putSuccess(A.toString());
        UI.putSuccess(B.toString());
        UI.putSuccess(C.toString());

        UI.putMessage("Бригада стреляет:");
        A.shoot();
        B.shoot();
        C.shoot();
    }
}
