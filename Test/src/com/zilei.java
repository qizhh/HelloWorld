package com;

public class zilei extends fulei {
    @Override
    public void fa()
    {
        System.out.println("执行子类的fa方法");
        a = 2;
    }

    public void fc(){
        System.out.println("执行子类的fc方法");
        super.fb();
    }

    public static void main(String[] args) {
        zilei zl = new zilei();
        zl.fc();
    }
}
