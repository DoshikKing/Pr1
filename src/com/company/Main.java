package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        int[] mas1 = new int[10];
        double[] mas2 = new double[10];
        Random ms = new Random();

        // 3d point of lab
        for(int i = 0; i < mas1.length; i++)
        {
            mas1[i] = ms.nextInt(10);
        }
        int a = 0;
        for(int i = 0; i < mas1.length; i++)
        {
            a += mas1[i];
        }
        for(int i = 0; i < mas1.length; i++)
        {

            a += mas1[i];
        }
        System.out.println(a);

        //4 points nm1
        for(int i = 0; i < mas1.length; i++)
        {

            mas1[i] = ms.nextInt(10);
        }
        for(int i = 0; i < mas1.length; i++)
        {
            System.out.println(mas1[i]);
            a += mas1[i];
        }

        for(int i = 0; i < mas2.length; i++)
        {
            double area = Math.random();
            mas2[i] = area;
        }

        for(int i = 0; i < mas2.length; i++)
        {
            System.out.println(mas2[i]);
        }

            System.out.println("_______________");
        Arrays.sort(mas2);
        System.out.println(Arrays.toString(mas2));
        //Arrays.sort(mas1);
        //System.out.println(Arrays.toString(mas1));

    }
}
