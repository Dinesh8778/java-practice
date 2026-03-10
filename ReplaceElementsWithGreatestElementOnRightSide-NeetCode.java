class Solution {
    public int[] replaceElements(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i] = max(arr, i+1);
        }
        return arr;
    }
    int max(int[] arr, int j){
        if(j == arr.length) return -1;

        int m = 0;
        for(int i=j;i<arr.length;i++){
            m = Math.max(m,arr[i]);
        }
        return m;
    }
}