package ru.kalashnikov.weapons;

public class Gunner
{
    private String _name;
    private Weapon _weapon;

    public Gunner(String name)
    {
        _name = name;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        _name = name;
    }

    public Weapon getWeapon()
    {
        return _weapon;
    }

    public void setWeapon(Weapon w)
    {
        _weapon = w;
    }

    public void shoot()
    {
        if (_weapon != null)
        {
            _weapon.shoot();
        }
        else
        {
            System.out.println("Не могу участвовать в перестрелке");
        }
    }

    @Override
    public String toString()
    {
        String s = String.format("Стрелок %s", _name);
        String w = "без оружия";

        if (_weapon != null) w = String.format("держит %s", _weapon);

        return s + ", " + w;
    }
}
