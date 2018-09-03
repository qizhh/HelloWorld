package com;

public class fulei
{
    public int a;
    public void fa()
    {
        System.out.println("执行父类的fa方法");
        a = 1;
    }
    public void fb()
    {
        System.out.println("执行父类的fb方法");
        fa();
    }
}
