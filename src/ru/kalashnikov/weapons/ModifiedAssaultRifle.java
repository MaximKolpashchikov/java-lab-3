package ru.kalashnikov.weapons;

public class ModifiedAssaultRifle extends ModifiedPistol
{
    private final int _fireRate;

    public ModifiedAssaultRifle()
    {
        super(30);
        _fireRate = 30;
    }

    public ModifiedAssaultRifle(int maxAmmo)
    {
        super(maxAmmo);
        _fireRate = Math.max(maxAmmo / 2, 1);
    }

    public ModifiedAssaultRifle(int maxAmmo, int fireRate)
    {
        super(maxAmmo);

        if (fireRate < 1)
            throw new IllegalArgumentException("Скорострельность не может быть меньше 1 патрона/сек");

        _fireRate = fireRate;
    }

    @Override
    public void shoot()
    {
        for (int i = 0; i < _fireRate; ++i)
        {
            super.shoot();
        }
    }

    public void shoot(int seconds)
    {
        for (int i = 0; i < seconds; ++i)
        {
            shoot();
        }
    }

    @Override
    public String toString()
    {
        return String.format("Автомат, %d/%d патронов", ammo(), _maxAmmo);
    }
}
