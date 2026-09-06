class Solution {
    public int firstMissingPositive(int[] arr) {

        int n = arr.length;

        // Put each number in its correct position
        for (int i = 0; i < n; i++) {

            while (arr[i] >= 1 &&
                   arr[i] <= n &&
                   arr[arr[i] - 1] != arr[i]) {

                int correctIndex = arr[i] - 1;

                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        // Find the first number in the wrong position
        for (int i = 0; i < n; i++) {

            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}