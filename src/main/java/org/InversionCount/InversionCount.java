package org.InversionCount;

import java.util.Arrays;
import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        MergeSortInversionCounter counter = new MergeSortInversionCounter();
        int inversionCount = counter.countInversions(arr);
        System.out.println("Number of inversions: " + inversionCount);
    }
}