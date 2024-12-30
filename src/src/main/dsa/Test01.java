package src.main.dsa;


public class Test01 {
//    n*(n+1) /2
    public int getSum (int n) {
        int result = n*(n+1)/2;
        return result;
    }


    // 배열 최대값
    public int getMaxVal (int[] arr) {

        int target = arr[0];
        for (int i = 0; i < arr.length -1 ; i++) {
            if (arr[i+1] > target) {
                target = arr[i+1];
            }

        }
        return target;
    }
    // 최소값
    public int getMinVal (int[] arr) {

        int target = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] < target) {
                target = arr[i + 1];
            }
        }
        return target;
    }
}