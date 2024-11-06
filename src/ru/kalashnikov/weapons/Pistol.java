package ru.kalashnikov.weapons;

public class Pistol
{
    protected final int _maxAmmo;
    protected int _ammo;

    public Pistol()
    {
        _maxAmmo = 5;
        _ammo = 5;
    }

    public Pistol(int maxAmmo)
    {
        if (maxAmmo < 1)
            throw new IllegalArgumentException("Объем магазина не может быть меньше 1");

        _maxAmmo = maxAmmo;
        _ammo = 0;
    }

    public Pistol(int maxAmmo, int ammo)
    {
        this(maxAmmo);
        reload(ammo);
    }

    public int getMaxAmmo()
    {
        return _maxAmmo;
    }

    public int getAmmo()
    {
        return _ammo;
    }

    public boolean isLoaded()
    {
        return _ammo > 0;
    }

    public int reload(int ammo)
    {
        if (ammo < 0)
            throw new IllegalArgumentException("Нельзя зарядить пистолет отрицательным числом патронов");

        int extra = 0;

        _ammo += ammo;

        if (_ammo > _maxAmmo)
        {
            extra = _ammo - _maxAmmo;
            _ammo = _maxAmmo;
        }

        return extra;
    }

    public void unload()
    {
        _ammo = 0;
    }

    public void fire()
    {
        if (_ammo > 0)
        {
            System.out.println("Бах!");
            _ammo--;
        }
        else
        {
            System.out.println("Клац!");
        }
    }

    @Override
    public String toString()
    {
        return String.format("Пистолет, %d/%d патронов", _ammo, _maxAmmo);
    }
}
