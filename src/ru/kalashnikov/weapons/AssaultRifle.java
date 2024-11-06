package ru.kalashnikov.weapons;

public class AssaultRifle extends Pistol
{
    private final int _fireRate;

    public AssaultRifle()
    {
        super(30);
        _fireRate = 30;
    }

    public AssaultRifle(int maxAmmo)
    {
        super(maxAmmo);
        _fireRate = Math.max(maxAmmo / 2, 1);
    }

    public AssaultRifle(int maxAmmo, int fireRate)
    {
        super(maxAmmo);

        if (fireRate < 1)
            throw new IllegalArgumentException("Скорострельность не может быть меньше 1 патрона/сек");

        _fireRate = fireRate;
    }

    @Override
    public void fire()
    {
        for (int i = 0; i < _fireRate; ++i)
        {
            super.fire();
        }
    }

    public void fire(int seconds)
    {
        for (int i = 0; i < seconds; ++i)
        {
            fire();
        }
    }

    @Override
    public String toString()
    {
        return String.format("Автомат, %d/%d патронов", _ammo, _maxAmmo);
    }
}
