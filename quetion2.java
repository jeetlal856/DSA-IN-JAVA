public class quetion2 {
    public static int checkTarget(int arr[], int target) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = arr[i];

            }
        }
        return ans;

    }

    public static int findIdx(int arr[], int idx, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                idx = i;
            }
        }
        return idx;
    }

    public static int rotateArr(int arr[], int target) {
        int storeTarget = checkTarget(arr, target);
        int storeidx = findIdx(arr, 0, storeTarget);
        System.out.println("storetarget is " + storeTarget);
        System.out.println();
        if (storeTarget != -1) {
            int i = 0;
            while (i != storeidx) {
                int temp = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 1] = temp;
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return storeTarget;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 3, 5, 6, 7 };
        int ans = rotateArr(arr, 4);
        System.out.println("return ans is " + ans);
    }

}
