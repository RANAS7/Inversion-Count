package org.InversionCount;

public class MergeHelper {

    public int mergeAndCount(int[] arr, int[] tempArr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                tempArr[k++] = arr[i++];
            } else {
                tempArr[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }

        while (j <= right) {
            tempArr[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = tempArr[i];
        }

        return invCount;
    }
}
