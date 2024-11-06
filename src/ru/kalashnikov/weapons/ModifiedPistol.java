package ru.kalashnikov.weapons;

public class ModifiedPistol extends Weapon
{
    protected final int _maxAmmo;

    public ModifiedPistol()
    {
        super(5);
        _maxAmmo = 5;
    }

    public ModifiedPistol(int maxAmmo)
    {
        super(0);

        if (maxAmmo < 1)
            throw new IllegalArgumentException("Объем магазина не может быть меньше 1");

        _maxAmmo = maxAmmo;
    }

    public ModifiedPistol(int maxAmmo, int ammo)
    {
        this(maxAmmo);
        reload(ammo);
    }

    public int getMaxAmmo()
    {
        return _maxAmmo;
    }

    public boolean isLoaded()
    {
        return ammo() > 0;
    }

    public int reload(int ammo)
    {
        if (ammo < 0)
            throw new IllegalArgumentException("Нельзя зарядить пистолет отрицательным числом патронов");

        int extra = 0;

        load(ammo() + ammo);

        if (ammo() > _maxAmmo)
        {
            extra = ammo() - _maxAmmo;
            load(_maxAmmo);
        }

        return extra;
    }

    public void unload()
    {
        load(0);
    }

    public void shoot()
    {
        if (getAmmo())
        {
            System.out.println("Бах!");
        }
        else
        {
            System.out.println("Клац!");
        }
    }

    @Override
    public String toString()
    {
        return String.format("Пистолет, %d/%d патронов", ammo(), _maxAmmo);
    }
}
