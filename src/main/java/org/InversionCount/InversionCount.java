package org.InversionCount;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = {1, 9, 6, 4, 5};
        MergeSortInversionCounter counter = new MergeSortInversionCounter();
        int inversionCount = counter.countInversions(arr);
        System.out.println("Number of inversions: " + inversionCount);
    }
}
g