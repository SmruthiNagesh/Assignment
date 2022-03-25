package com.user;

public class reverseArray {

    public static void main(String[] args) {
        int [] array = new int  []{10,11,12,23,34,45};
        System.out.println("Before Reversing : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("After Reversing: ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}