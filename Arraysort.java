package com.user;
import java.util.Arrays;
import java.util.Scanner;

public class Arraysort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[5];
        System.out.println("Enter elements in an array");
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("After sort");
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}