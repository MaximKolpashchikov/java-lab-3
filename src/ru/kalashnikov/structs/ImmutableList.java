package ru.kalashnikov.structs;

public class ImmutableList
{
    private final int[] _values;

    public ImmutableList(int... values)
    {
        _values = new int[values.length];
        System.arraycopy(values, 0, _values, 0, values.length);
    }

    public ImmutableList(ImmutableList other)
    {
        _values = new int[other._values.length];
        System.arraycopy(other._values, 0, _values, 0, other._values.length);
    }

    public int getAt(int index)
    {
        if (index < 0 || index > _values.length - 1)
            throw new IllegalArgumentException("Индекс за границей массива");
        return _values[index];
    }

    public void setAt(int index, int value)
    {
        if (index < 0 || index > _values.length - 1)
            throw new IllegalArgumentException("Индекс за границей массива");
        _values[index] = value;
    }

    public boolean isEmpty()
    {
        return _values.length == 0;
    }

    public int length()
    {
        return _values.length;
    }

    public int[] getValues()
    {
        return _values;
    }

    @Override
    public String toString()
    {
        StringBuilder result = new StringBuilder();
        boolean isHead = true;

        result.append("[");

        for (int v : _values)
        {
            if (isHead) isHead = false;
            else result.append(", ");

            result.append(v);
        }

        result.append("]");

        return result.toString();
    }
}
