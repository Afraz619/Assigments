/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.collectiondemo;

/**
 *
 * @author syeda
 */
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List<Integer> leftRotateArrayList(List<Integer> arr, int d) {
        int n = arr.size();
        if (n == 0 || d <= 0) {
            return arr; // No rotation needed
        }

        d = d % n; // Ensure d is within the size of the ArrayList

        if (d == 0) {
            return arr; // No rotation needed
        }

        List<Integer> rotatedList = new ArrayList<>();
        rotatedList.addAll(arr.subList(d, n));
        rotatedList.addAll(arr.subList(0, d));

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>();
        originalList.add(1);
        originalList.add(2);
        originalList.add(3);
        originalList.add(4);
        originalList.add(5);

        int rotateBy = 2;

        System.out.println("Original ArrayList: " + originalList);

        List<Integer> rotatedList = leftRotateArrayList(originalList, rotateBy);

        System.out.println("Left-Rotated by " + rotateBy + " positions: " + rotatedList);
    }
}

