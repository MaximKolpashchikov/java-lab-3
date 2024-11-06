package ru.kalashnikov.weapons;

abstract class ModifiedWeapon
{
    protected int ammo;

    public ModifiedWeapon(int ammo)
    {
        if (ammo < 0) throw new RuntimeException();
        this.ammo = ammo;
    }

    abstract void shoot();

    public boolean getAmmo()
    {
        if (ammo == 0) return false;
        ammo--;
        return true;
    }

    public int load(int ammo)
    {
        if (ammo < 0) throw new RuntimeException();
        int tmp = ammo;
        this.ammo = ammo;
        return tmp;
    }
}
