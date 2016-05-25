package jba.roumani.sandbox1;

import java.util.Scanner;

/**
 * Created by roumani on 16-01-02.
 */
public class ComputeEngine
{
    private int count;

    public ComputeEngine()
    {
        this.count = 0;
    }

    public int getCount()
    {
        return this.count;
    }

    public int compute(int a, int b)
    {
        return a + b;
    }

    public int compute(String a, String b)
    {
        return a.indexOf(b);
    }

    public double compute(double a, double b)
    {
        return Math.pow(a, b);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter age ...");
        int age = in.nextInt();
        System.out.println("age * 2 = " + 2 * age);
    }

}
