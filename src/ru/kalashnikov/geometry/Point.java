package ru.kalashnikov.geometry;

public class Point
{
    private int X;
    private int Y;

    public int getX()
    {
        return X;
    }
    public int getY()
    {
        return Y;
    }
    public void setX(int x)
    {
        X = x;
    }
    public void setY(int y)
    {
        Y = y;
    }

    public Point(int X, int Y)
    {
        this.X = X;
        this.Y = Y;
    }

    @Override
    public String toString()
    {
        return "{" + X + "; " + Y + "}";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;

        final Point other = (Point) obj;

        return this.X == other.X && this.Y == other.Y;
    }
}