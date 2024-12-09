package org.InversionCount;


public class MergeSortInversionCounter {

    private final MergeHelper mergeHelper;

    public MergeSortInversionCounter() {
        this.mergeHelper = new MergeHelper();
    }

    public int mergeSortAndCount(int[] arr, int[] tempArr, int left, int right) {
        int invCount = 0;

        if (left < right) {
            int mid = (left + right) / 2;

            invCount += mergeSortAndCount(arr, tempArr, left, mid);

            invCount += mergeSortAndCount(arr, tempArr, mid + 1, right);

            invCount += mergeHelper.mergeAndCount(arr, tempArr, left, mid, right);
        }

        return invCount;
    }

    public int countInversions(int[] arr) {
        int[] tempArr = new int[arr.length];
        return mergeSortAndCount(arr, tempArr, 0, arr.length - 1);
    }
}
